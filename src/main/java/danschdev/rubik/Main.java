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
public class Main {
    public static void main(String[] args) {
        Cube instance = new Cube();
        Report (instance);
        instance.turnZ();
        System.out.println("Turning Z!");
        Report (instance);
        instance.turnX();
        System.out.println("Turning X!");
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
