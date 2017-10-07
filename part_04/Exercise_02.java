package part_04;

/**

 Use a for loop to count to 2017. While looping, populate an array with the
 value of your iterator (ie, i). Once populated, print out the odd values
 (ie, 2017, 2015, 2013) of the array in reverse order.

 */

public class Exercise_02 {

    public static void main(String[] strings) {

        int length = 17;                //create  a new int =17
        int[] ar = new int[length];     // create a new int array =17



        for (int i=0; i <length;) {     //  index between 0 and 17

            ar[i] = ++i;              // populate the array. If it was i++ would populate with even numbers

        }

        for (int i = ar.length -1; i >=0; i--) { // sets index equal to the length of the array -1(index)
            if(i%2 ==0) { //sorts for all index with even numbers, which are the odd number elements
                System.out.println(ar[i]); //prints the the value of the array at the even number indexes



            }

        }

    }
}


