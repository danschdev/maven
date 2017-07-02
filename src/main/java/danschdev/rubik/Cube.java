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

public class Cube {

    public Cube() {
        this.setSide(Side.front, Color.GREEN);
        this.setSide(Side.back, Color.YELLOW);
        this.setSide(Side.left, Color.PURPLE);
        this.setSide(Side.right, Color.BLUE);
        this.setSide(Side.up, Color.RED);
        this.setSide(Side.down, Color.PINK);
    }
   
    private Side opposite(Side original) {
        switch (original) {
            case front : return Side.back;
            case back: return Side.front;
            case left: return Side.right;
            case right: return Side.left;
            case up: return Side.down;
            case down: return Side.up;
        }
        return Side.up;
    };
    
    private void setSide(Side target, Color value) {
        target.setColor(value);
    }
    
    public void turnFromTo(Side start, Side target){
        Color originalTargetColor = target.getColor();
        this.setSide(target, start.getColor());
        this.setSide(start, opposite(target).getColor());
        this.setSide(opposite(target), opposite(start).getColor());
        this.setSide(opposite(start), originalTargetColor);
    }
    
    public Color getFront() {
        return Side.front.getColor();
    }
    public Color getBack() {
        return Side.back.getColor();
    }
    public Color getLeft() {
        return Side.left.getColor();
    }
    public Color getRight() {
        return Side.right.getColor();
    }
    public Color getUp() {
        return Side.up.getColor();
    }
    public Color getDown() {
        return Side.down.getColor();
    }
        
}
