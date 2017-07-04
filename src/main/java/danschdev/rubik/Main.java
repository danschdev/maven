/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danschdev.rubik;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class Main {
    public static void main(String[] args) {
        Cube instance = new Cube();
        Side direction = Side.up;
        while (direction != Side.front) {
            Report (instance);
            direction = readSide();
            turn(instance, Side.front, direction);
        }
    }
    
    private static Side readSide() {
        Scanner userInput = new Scanner(System.in);
        String direction;
        Side value;
        direction = userInput.next();
        switch (direction) {
            case "l": {
                value = Side.left;
                break;
            }
            case "r": {
                value = Side.right;
                break;
            }
            case "u": {
                value = Side.up;
                break;
            }
            case "d": {
                value = Side.down;
                break;
            }
            default: {
                value = Side.front;
                break;
            }
        }
        return value;
    }

    private static void turn(Cube instance, Side from, Side to) {
        try {
            instance.turnFromTo(from, to);
            System.out.println("Turning from " + from + " to " + to + "!");
        } catch (IOException e) {
            System.out.println("Cannot rotate! " + e.getMessage());
        }
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
