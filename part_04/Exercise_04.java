package part_04;

class Exercise_04 {
    public static void main(String[] args) {
        int[][] dataArray = {                //declares a 2-d array [4] and irregular
                {12, 45, 67},
                {8, 4, 13, -43, 98},
                {567, 1, 0, -2},
                {18, -456, 14, 6, 48, -80}

        };


         System.out.println(getMaxVal(dataArray));   // call the getMaxVal on dataArray
         System.out.println(getMinVal(dataArray));   // call the getMinVAl on dataArray
    }

      // iterate through array and determine max value in array
      public static int getMaxVal(int[][] dataArray) {  //declares a getMaxVal method that returns an int and takes a 2d array

          int max = dataArray[0][0];   // sets the data array  to the very first index

          for (int[] a : dataArray) {  // for each value of a along the vertical axis of dataArray
              for (int b : a) {        // for each value of b along the horizontal axis of each [a]

                  if (b > max) {     // if the value of b is great than the max set at index 0,0
                      max =b;       // be becomes the max
                  }
              }
          }
          return max;                // returns the max back to the getMaxVal method
      }

    // iterate through array and determine minimum value
        public static int getMinVal(int[][] dataArray) { // same exact principle as above only looking for min

            int min = dataArray[0][0];

            for(int[] a : dataArray) {
                for (int b : a) {

                if (b < min) {
                    min = b;

                }
            }
        }
            return min;



                }

            }



