/*
 * Author: Devanshi Patel
 * Student ID: 100805084
 * Date: November 10, 2021
 * Course: OOP3200
 * Assignment type: In-Class Activity 8
 */


package ca.durhamcollege;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // Define Scanner
        Scanner keyboard = new Scanner(System.in);

        // Input
        String name;
        System.out.print("Please enter your name: ");
        name = keyboard.nextLine();

        float age = 0.0f;
        boolean isValidInput = false; // sentinel variable

        do
        {
            System.out.print("Please enter your age: ");
            try
            {
                age = keyboard.nextFloat();
                isValidInput = true;

                if((age <= 0.0f) || (age >=120.0f))
                {
                    System.out.println("Error: You must enter an age grater than 0.0 and less than 120.0 years old");
                    keyboard.nextLine();
                    isValidInput = false;
                }
            }
            catch (InputMismatchException inputMismatchException)
            {
                System.out.print("Error: You must enter a valid floating-point number.");
                keyboard.nextLine();
                isValidInput = false;
            }
        } while (!isValidInput);

        // Multi-dimensional array

        System.out.println();
        System.out.println("Multi-Dimensional Array Example");
        int rows = 8;
        int cols = 8;
        float[][] board = new float[rows][cols];

        for (int x = 0; x < rows; x++)
        {
            for (int y = 0; y < cols; y++)
            {
                board[x][y] = (float) (Math.random() * 100.0) + 1.0f;
            }
        }

        System.out.println("Showing 10 Random Values: ");

        for (int i = 0; i < 10; i++)
        {
            var randRows = (int) (Math.random() * rows);
            var randCols = (int) (Math.random() * cols);
            System.out.print("For row: " + randRows + " col: " + randCols + " ");
            System.out.printf("The Random number is: %.2f \n", board[randRows][randCols]);
        }

        // Output
        System.out.println();
        System.out.printf("You Entered: %s \n", name);
        System.out.printf("You Entered: %.2f \n", age);
    }
}
