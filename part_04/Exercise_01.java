package part_04;

import org.jcp.xml.dsig.internal.SignerOutputStream;

import java.util.Scanner;
/**

 Read in 10 integers from the user. Place all 10 integers into an array in the order they were received.
 Print out the second integer received, followed by the 4th, then the 6th, then the 8th, then the 10th.
 The print out the 9th, 7th, 5th, 3rd, and 1st.

 Example input: 1,2,3,4,5,6,7,8,9,10
 Example output: 2,4,6,8,10,9,7,5,3,1

 Output can be on one line or many lines. However you like.

 */


public class Exercise_01 {

    public static void main(String[] strings) throws java.io.IOException {

        Scanner input = new Scanner(System.in);

        //declares a new 10 element array object
        int a[] = new int[10];

        //set the index of the array at 0-10 to the user input
        for (int i = 0; i < 10; i++) {

            a[i] = input.nextInt();
        }

        //another for loop that set the index of the array at 0-10
        for (int i = 0; i < a.length; i++) {
            //if index is not divisible by two
            if (i % 2 != 0) {
                // print out the odd number index in ascending order
                System.out.println(a[i]);
            }
        }

        //a for loop that takes the lenght of the array -1(index) and counts down to 0
        for (int i = (a.length -1); i >=  0; i--) {
            // if the index is divisible by 0
            if (i %2 ==0) {
                // prints the even number index in descending order
                System.out.println(a[i]);
            }
        }
    }
}










