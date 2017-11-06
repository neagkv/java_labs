package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 3:
 *
 *      Read in a number in feet from the console
 *      and print out the corresponding length in meters
 *
 *      1 foot = .305 meter.
 */

public class Exercise_03 {

    public static void main(String[] args) throws java.io.IOException {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Feet: ");

        double lengthFeet = input.nextDouble();

        double lengthMeter = (lengthFeet * 0.305);

        System.out.println(lengthFeet + " " + "feet" + " " +  " equals" + " " + lengthMeter + " " + "In meters");

    }
}