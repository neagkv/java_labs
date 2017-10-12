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


