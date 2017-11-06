
package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 11:
 *
 *      Calculate investment value
 *
 *      Recieved the following args from user:
 *          - investment amount
 *          - interest rate in percentage
 *          - number of years to invest
 *
 *      Print future value to the console.
 *
 */

public class Exercise_11 {

    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");

        double amount = input.nextDouble();

        System.out.print("Enter annual interest rate in percentage: ");

        double rate = input.nextDouble();

        System.out.print("Enter number of years: ");

        double years = input.nextDouble();

        double totalInvestment =(((rate/100) * amount) * years + amount);

        System.out.println(totalInvestment);

    }
}


