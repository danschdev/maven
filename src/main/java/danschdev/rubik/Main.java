/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danschdev.rubik;

import java.io.IOException;

/**
 *
 * @author daniel
 */
public class Main {
    public static void main(String[] args) {
        Cube instance = new Cube();
        Report (instance);
        try {
            instance.turnFromTo(Side.back, Side.back);
        System.out.println("Turning back to back!");
        } catch (IOException e) {
            System.out.println("Cannot rotate! " + e.getMessage());
        }
        Report (instance);
        try {
            instance.turnFromTo(Side.front, Side.up);
            System.out.println("Turning front to up!");
        } catch (IOException e) {
            System.out.println("Cannot rotate! " + e.getMessage());
        }        
        Report (instance);
    }

    private static void Report(Cube instance) {
        System.out.println ( "Front: " + instance.getFront() );
        System.out.println ( "Right: " + instance.getRight() );
        System.out.println ( "Left: " + instance.getLeft() );
        System.out.println ( "Back: " + instance.getBack() );
        System.out.println ( "Up: " + instance.getUp() );
        System.out.println ( "Down: " + instance.getDown() );
    }
}
