package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 8:
 *
 *      Receive a number between 0 and 1,000,000,000 from the user.
 *      Use while loop to find the number - when the number is found
 *      exit the loop and print the number to the console.
 *
 */
public class Exercise_08 {


    public static void main(String[] args) throws java.io.IOException {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 1 billion");
        double yourNumber = input.nextDouble();
        //double computerGuess =( Math.random()* 1000000000 + 0); //generate a random number between a billion and 0
        double count =0;

        System.out.println("Enter a number between 0 and 1 billion");

        if(yourNumber >= 0 && yourNumber <1000000000) {
            System.out.print("Valid number");

            System.out.print("The count is " + count);
            while (yourNumber != count) {
                System.out.println("Guess #: " + count);
                count++;
            }
            System.out.println("Your number is " + count);
        } else {
            System.out.println("You entered an invalid number");
        }

    }
}

