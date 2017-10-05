package part_04;

class Exercise_04 {
    public static void main(String[] args) {
        int[][] dataArray = {
                {12, 45, 67},
                {8, 4, 13, -43, 98},
                {567, 1, 0, -2},
                {18, -456, 14, 6, 48, -80}

        };


         System.out.println(getMaxVal(dataArray));
         System.out.println(getMinVal(dataArray));
    }

      // iterate through array and determine max value in array
      public static int getMaxVal(int[][] dataArray) {

          int max = dataArray[0][0];

          for (int[] a : dataArray) {
              for (int b : a) {

                  if (b > max) {
                      max =b;
                  }
              }
          }
          return max;
      }

    // iterate through array and determine minimum value
        public static int getMinVal(int[][] dataArray) {

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



