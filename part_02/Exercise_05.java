package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 5:
 *
 *      Write a program called PrintNumberInWord which prints "ONE", "TWO",... ,
 *      "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or other, respectively.
 *      Use a "nested-if" statement;
 *
 *
 */
public class Exercise_05 {

    public static void main(String[] args) throws java.io.IOException {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number 1-10: ");

        int YourNumber = input.nextInt();

        if(YourNumber == 1) {
            System.out.println("ONE");
        }
        else if(YourNumber == 2) {
            System.out.println("TWO");
        }
        else if(YourNumber == 3) {
            System.out.println("THREE");
        }
        else if(YourNumber == 4) {
            System.out.println("FOUR");

        }   else if(YourNumber == 5) {
            System.out.println("FIVE");

        }  else if(YourNumber == 6) {
            System.out.println("SIX");

        }   else if(YourNumber == 7) {
            System.out.println("SEVEN");

        }   else if(YourNumber == 8) {
            System.out.println("EIGHT");

        }   else if(YourNumber == 9) {
            System.out.println("NINE");
        }   else {
            System.out.println("OTHER");
        }
    }

}

