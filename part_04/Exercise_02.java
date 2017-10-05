package part_04;

/**

 Use a for loop to count to 2017. While looping, populate an array with the
 value of your iterator (ie, i). Once populated, print out the odd values
 (ie, 2017, 2015, 2013) of the array in reverse order.

 */

public class Exercise_02 {

    public static void main(String[] strings) {

        int length = 17;
        int[] ar = new int[length];



        for (int i=0; i <length;) {

            ar[i] = ++i;

        }

        for (int i = ar.length -1; i >=0; i--) {
            if(i%2 ==0) {
                System.out.println(ar[i]);



            }

        }

    }
}


