/*
 * Author: Devanshi Patel
 * Student ID: 100805084
 * Date: November 10, 2021
 * Course: OOP3200
 * Assignment type: In-Class Activity 8
 */


package ca.durhamcollege;

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
        System.out.print("Please enter your age: ");
        age = keyboard.nextFloat();
        System.out.println();

        // Output
        System.out.printf("You Entered: %s \n", name);
        System.out.printf("You Entered: %.2f \n", age);
    }
}
