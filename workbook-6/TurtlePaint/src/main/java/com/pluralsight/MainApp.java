package com.pluralsight;

import com.pluralsight.forms.Turtle;
import com.pluralsight.forms.World;

import java.awt.*;

public class MainApp
{
    public static void main(String[] args)
    {
        // This starter code to get you familiar with how
        // the TurtleLogo application works

        // The world is your canvas
        World world = new World(300, 300);
        Turtle turtle = new Turtle(world, -100, 100);
        Turtle rudy = new Turtle(world, -100, 100);
        
        int width = 200;
        int height = 200;

        // calculate the hypotenuse (diagonal)
        // a2 + b2 = c2
        /*double widthSquared = Math.pow(width, 2);
        double heightSquared = Math.pow(height, 2);
        double hypotenuse = Math.sqrt(widthSquared + heightSquared);*/


        turtle.setPenWidth(3);
        turtle.setColor(Color.DARK_GRAY);

        turtle.penDown();
        turtle.turnLeft(90);

        for (int i = 0; i < 10; i++) {
            turtle.penDown();
            turtle.forward(195);
            turtle.penUp();
            turtle.turnRight(90);
            turtle.forward(10);
            turtle.turnRight(90);
            turtle.penDown();
            turtle.forward(195);
            turtle.penUp();
            turtle.turnLeft(90);
            turtle.forward(10);
            turtle.turnLeft(90);
        }

        for (int i = 0; i < 10; i++) {
            rudy.penDown();
            rudy.forward(200);
            rudy.penUp();
            rudy.turnLeft(90);
            rudy.forward(10);
            rudy.turnLeft(90);
            rudy.penDown();
            rudy.forward(200);
            rudy.penUp();
            rudy.turnRight(90);
            rudy.forward(10);
            rudy.turnLeft(90);
        }
    }
}
