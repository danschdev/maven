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
public enum Side {
    front,
    back,
    left,
    right,
    up,
    down;

    private Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
