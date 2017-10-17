package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 4:
 *
 *      Pounds to kilos
 *
 *      One pound is 0.454 kilograms.
 *
 *
 */

public class Exercise_04 {

    public static void main(String[] args) throws java.io.IOException {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter pounds: ");

        double WeightPounds = input.nextDouble();

        double WeightKilos = (WeightPounds * 0.454);

        System.out.println(WeightPounds + " " + "lbs" + " " +  " equals" + " " + WeightKilos + " " + "In kg");

    }
}