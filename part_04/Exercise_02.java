package part_04;

/**

 Use a for loop to count to 2017. While looping, populate an array with the
 value of your iterator (ie, i). Once populated, print out the odd values
 (ie, 2017, 2015, 2013) of the array in reverse order.

 */

public class Exercise_02 {

    public static void main(String[] strings) {

        //create  a new int = 17
        int length = 2017;
        //create a new int array = 17
        int[] ar = new int[length];

        //index between 0 and 17
        for (int i=0; i <length;) {

            // populate the array. If it was i++ would populate with even numbers
            ar[i] = ++i;

        }

        // sets index equal to the length of the array -1(index)
        for (int i = ar.length -1; i >=0; i--) {
            //sorts for all index with even numbers, which are the odd number elements
            if(i%2 ==0) {
                //prints the the value of the array at the even number indexes
                System.out.println(ar[i]);
            }

        }

    }
}


