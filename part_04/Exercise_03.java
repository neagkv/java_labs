package part_04;

/**

 Create, populate, and print out a two-dimensional array that will show the following output:

 0 1 2 3 4 5 6 7 8 9
 10 11 12 13 14 15 16 17 18 19
 20 21 22 23 24 25 26 27 28 29
 30 31 32 33 34 35 36 37 38 39
 40 41 42 43 44 45 46 47 48 49

 */

public class Exercise_03 {

    public static void main(String[] strings) {

        int[][] a = new int [5][10];     //creates new 2-d array
        int count=0;                     // creates a count variable and sets it equal to zero

        for(int i=0; i < a.length; i++){    // counts up from zero to the length of the array of arrays (4)
            for(int j=0; j < a[i].length; j++){ // creates a new index sets it equal to zero and less than the (10)
                                                // 10 equals the index of a[i]. a[4] has 9 indexes


                a[i][j] =count;                // sets each index in the 2-d array = count
                count++;                        // counts ++ to continue the loop and populate the array
            }
        }

        for(int[] x: a) {                           // for each int array value of x on the vertical axis of a
            for (int y : x) {                       //for each value of y along the horizontal axis of x
                System.out.print(y + " ");         // print  that value and add a space
            }
            System.out.println();                   // prints a blank line after every iteration
        }


    }


}