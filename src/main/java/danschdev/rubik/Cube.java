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

//    public int[][][] value;

    private Color front;
    private Color back;
    private Color left;
    private Color right;
    private Color up;
    private Color down;

    public Cube() {
        this.front = Color.GREEN;
        this.back = Color.YELLOW;
        this.left = Color.PURPLE;
        this.right = Color.BLUE;
        this.up = Color.RED;
        this.down = Color.PINK;
    }
    
    public Color getFront() {
        return this.front;
    }
    public Color getBack() {
        return this.back;
    }
    public Color getLeft() {
        return this.left;
    }
    public Color getRight() {
        return this.right;
    }
    public Color getUp() {
        return this.up;
    }
    public Color getDown() {
        return this.down;
    }
    
    public void turnY() {
        Color originalFront = this.getFront();
        this.front = this.getRight();
        this.right = this.getBack();
        this.back = this.getLeft();
        this.left = originalFront;
    }
        
    public void turnInverseY() {
        Color originalFront = this.getFront();
        this.front = this.getLeft();
        this.right = originalFront;
        this.back = this.getRight();
        this.left = this.getBack();
    }
    
    public void turnX() {
        Color originalFront = this.getFront();
        this.front = this.getUp();
        this.up = this.getBack();
        this.back = this.getDown();
        this.down = originalFront;
    }
    
    public void turnInverseX() {
        Color originalFront = this.getFront();
        this.front = this.getDown();
        this.down = this.getBack();
        this.back = this.getUp();
        this.up = originalFront;
    }
    
    public void turnZ() {
        Color originalUp = this.getUp();
        this.up = this.getLeft();
        this.left = this.getDown();
        this.down = this.getRight();
        this.right = originalUp;
    }
    
}
