package part_11;


  /*
 make a new generic method called sumArray that will return the
 sum of all numbers in the array (no matter data type of numbers
 the array has in it)
     */

public class Bonus <T extends Number> {

    T num;

    public Bonus(T n) {
        n = num;
    }

    public static <T extends Number> double sumArray(T[] array) {

        double sum = 0;

        for (T x : array) {
            sum += x.doubleValue();


        }

        return sum;
    }
}




