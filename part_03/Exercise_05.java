package part_03;

import java.util.Scanner;

public class Exercise_05 {

    public static void main(String[] strings) throws java.io.IOException {


        int yourNum;

        do {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number between 1 and 999999999: ");
            yourNum = input.nextInt();
        } while (yourNum < 1 || yourNum > 999999999);


            System.out.println("Y");

            if (yourNum % 4 == 0 && yourNum % 7 == 0) {
                System.out.println("YY");
            }  else if (yourNum % 4 == 0 ^ yourNum % 7 == 0) {
                System.out.println("YYYY");
            } else {
                System.out.println("N");
            }
;
        }
    }



        // read an integer from the user >=1 and <= 999,999,999


        // use the && operator to see if the user's number is divisible by both 4 and 7


        // use the || operator to see if the user's number is divisible by 4 or 7


        // use the ^ operator to see if the user's number is divisible for 4 or 7 exclusively


        // print out the results
