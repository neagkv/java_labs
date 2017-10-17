package part_02;


import java.util.Scanner;

/**
 * Part 2 Exercise 7:
 *
 *      Write the necessary code to receive a number in minutes from the user, up to 1,000,000,000.
 *      How many years and days does that number in minutes represent?
 *
 *      For this exercise each year has 365 days.
 *
 */
public class Exercise_07 {
    public static void main(String[] args) throws java.io.IOException {

        Scanner input = new Scanner(System.in);


        System.out.print("Enter a # up to 1,000,000,000 : ");
        double minutes = input.nextDouble();

        double days;
        double years=0;
        double minsInYEAR =525600;

        if(minutes > 1000000000 || minutes < 0) {
            System.out.println("You Entered an invalid number");
        }
        else {
            years = minutes /minsInYEAR;
            days = (minutes % minsInYEAR)/(24*60);
            System.out.println((int)years + "years and " + (int)days + "days");
        }

    }




    }

}
