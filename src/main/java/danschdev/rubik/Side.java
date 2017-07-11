/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danschdev.rubik;

/**
 *
 * @author daniel
 */
public class Side {

    private Direction direction;
    private Color color;
    private Side opposite;

    public Side(Direction direction, Color color) {
        this.setDirection(direction);
        this.setColor(color);
    }
    
    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }    
    
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Side getOpposite() {
        return opposite;
    }

    public void setOpposite(Side opposite) {
        this.opposite = opposite;
    }

}
