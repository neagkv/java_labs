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

        int a[] = new int[10];


        for (int i = 0; i < 10; i++) {
            a[i] = input.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            if (i % 2 != 0) {
                System.out.println(a[i]);
            }
        }


        for (int i = (a.length -1); i >=  0; i--) {
            if (i %2 ==0) {
                System.out.println(a[i]);
            }
        }
            }


        }










