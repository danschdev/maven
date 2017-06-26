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
    public int[][][] value;
    
    public Cube() {
        value = new int[2][2][2];
        value[0][0][0] = 0;
        value[0][0][1] = 0;
        value[0][1][0] = 0;
        value[0][1][1] = 0;
        value[1][0][0] = 0;
        value[1][0][1] = 0;
        value[1][1][0] = 0;
        value[1][1][1] = 0;
    }
}
