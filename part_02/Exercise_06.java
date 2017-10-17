package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 6:
 *
 *      Write a program called PrintNumberInWord which prints "ONE", "TWO",... ,
 *      "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or other, respectively.
 *      Use a "switch-case" statement.
 *
 *
 */

public class Exercise_06 {

    public static void main(String[] args) throws java.io.IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number 1-10: ");

        int YourNumber = input.nextInt();


        switch(YourNumber) {
            case 1:
                System.out.println("YourNumber is ONE");
                break;
            case 2:
                System.out.println("YourNumber is TWO");
                break;
            case 3:
                System.out.println("YourNumber is THREE");
                break;
            case 4:
                System.out.println("YourNumber is FOUR");
                break;
            case 5:
                System.out.println("YourNumber is FIVE");
                break;
            case 6:
                System.out.println("yourNumber is SIX");
                break;
            case 7:
                System.out.println("yourNumber is SEVEN");
                break;
            case 8:
                System.out.println("Your Number is EIGHT");
                break;
            case 9:
                System.out.println("Your Number is NINE");
                break;
            default:
                System.out.println("Your Number is Other");
                break;
        }
        System.out.println();
    }
}