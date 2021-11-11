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


        // Output
        System.out.println();
        System.out.printf("You Entered: %s \n", name);
        System.out.printf("You Entered: %.2f \n", age);
    }
}
