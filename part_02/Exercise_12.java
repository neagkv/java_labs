package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 12:
 *
 *
 *      Receive the following arguments from the user:
 *          - miles to drive
 *          - MPG of the car
 *          - Price per gallon of fuel
 *
 *      Display the cost of the trip in the console.
 *
 *
 */

public class Exercise_12 {
    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter miles to drive: ");
        double miles = input.nextDouble();

        System.out.print("Enter MPG of car: ");
        double mpg = input.nextDouble();

        System.out.print("Price per gallon: ");
        double pricePerGal = input.nextDouble();

        double totalTripCoast = ((miles/mpg) * pricePerGal);
        System.out.println(totalTripCoast);
    }
}