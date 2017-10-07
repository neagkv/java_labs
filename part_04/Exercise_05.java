package part_04;

/**

 Here's an easy one for you.

 Create and populate an array with a length no less than 5. Use the enhanced for
 loop to iterate through the array and print out each value.

 */


public class Exercise_05 {

    public static void main(String[] strings) {

        int [] nums = new int [200];        // creates a new int array 200 elements long

        for(int i=0; i < nums.length; i++){ //populates the array
            nums[i] = i+1;
        }

        for(int x: nums) {                   // for each value x along the nums array
            System.out.println(nums[x-1]);   // print the value of x-1 which is the index

        }
    }
}