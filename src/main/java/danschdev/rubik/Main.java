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
        Report(instance);
    }
    
    private static Direction readSide() {
        Scanner userInput = new Scanner(System.in);
        String direction;
        Direction value;
        direction = userInput.next();
        switch (direction) {
            case "l": {
                value = Direction.left;
                break;
            }
            case "r": {
                value = Direction.right;
                break;
            }
            case "u": {
                value = Direction.up;
                break;
            }
            case "d": {
                value = Direction.down;
                break;
            }
            default: {
                value = Direction.front;
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
        instance.sides.forEach((s) -> {
            System.out.println(s.getDirection().toString() + ": " + s.getColor().toString());
        });
    }
}
