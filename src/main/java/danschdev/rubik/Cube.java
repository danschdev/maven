/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danschdev.rubik;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author daniel
 */
public class Cube {

    public final List<Side> sides;

    public Cube() {
        this.sides = new ArrayList();
        Side side;
        side = new Side(Direction.front, Color.GREEN);
        this.sides.add(side);
        side = new Side(Direction.back, Color.YELLOW);
        this.sides.add(side);
        this.sides.get(0).setOpposite(this.sides.get(1));
        this.sides.get(1).setOpposite(this.sides.get(0));
        side = new Side(Direction.left, Color.PURPLE);
        this.sides.add(side);
        side = new Side(Direction.right, Color.BLUE);
        this.sides.add(side);
        this.sides.get(2).setOpposite(this.sides.get(3));
        this.sides.get(3).setOpposite(this.sides.get(2));
        side = new Side(Direction.up, Color.RED);
        this.sides.add(side);
        side = new Side(Direction.down, Color.PINK);
        this.sides.add(side);
        this.sides.get(4).setOpposite(this.sides.get(5));
        this.sides.get(5).setOpposite(this.sides.get(4));
    }

    public void turnFromTo(Side start, Side target)
            throws IOException {
        if (target.equals(start) || target.equals(start.getOpposite())) {
            throw new IOException("Invalid turning arguments: Turning " + start + " to " + target + "!");
        }

        Side startSide
                = this.sides.stream().filter(p -> p.getDirection() == start.getDirection()).collect(Collectors.toList()).get(0);
        Side targetSide
                = this.sides.stream().filter(p -> p.getDirection() == start.getDirection()).collect(Collectors.toList()).get(1);
        Side startOpposite
                = startSide.getOpposite();
        Side targetOpposite
                = targetSide.getOpposite();
        
        Color originalStartColor = startSide.getColor();
        Color originalTargetColor = targetSide.getColor();
        Color originalStartOppColor = startOpposite.getColor();
        Color originalTargetOppColor = targetOpposite.getColor();
        
        target.setColor(originalStartColor);
        startOpposite.setColor(originalTargetColor);
        targetOpposite.setColor(originalStartOppColor);
        start.setColor(originalTargetOppColor);
    }

}
