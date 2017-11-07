package part_04;

class Exercise_04 {

    public static void main(String[] args) {
        //declares a 2-d array [4] and irregular
        int[][] dataArray = {
                {12, 45, 67},
                {8, 4, 13, -43, 98},
                {567, 1, 0, -2},
                {18, -456, 14, 6, 48, -80}

        };

        // call the getMaxVal on dataArray
         System.out.println(getMaxVal(dataArray));
        // call the getMinVAl on dataArray
         System.out.println(getMinVal(dataArray));
    }

      // iterate through array and determine max value in array
      //declares a getMaxVal method that returns an int and takes a 2d array
      public static int getMaxVal(int[][] dataArray) {

          // sets the data array  to the very first index
          int max = dataArray[0][0];

          // for each value of a along the vertical axis of dataArray
          for (int[] a : dataArray) {
              // for each value of b along the horizontal axis of each [a]
              for (int b : a) {
                  if (b > max) {
                      // be becomes the max
                      max =b;
                  }
              }
          }
          //returns the max back to the getMaxVal method
          return max;
      }

         // iterate through array and determine minimum value
        public static int getMinVal(int[][] dataArray) {
            // same exact principle as above only looking for min
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



