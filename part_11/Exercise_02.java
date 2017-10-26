package part_11;

/**
 Write a generic method to exchange the positions of two different elements in an array.
 */

public class Exercise_02 {


   static <T> void exchangeElements(T[] array, int i, int j) {

        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }

    static void test() {

        String[] stringArray = {"This", "Is", "A", "String", "Array"};
        exchangeElements(stringArray, 0, 4);

        for(String x : stringArray){
            System.out.println(x);
        }

        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8};

        exchangeElements(intArray, 0, 7);

        for(int x : intArray){
            System.out.println(x);
        }

        Boolean[] boolArray = {true, true, true, true, false};

        exchangeElements(boolArray, 1, 4);

        for(boolean x : boolArray){
            System.out.println(x);
        }

    }


    public static void main(String[] args) {



        test();


    }
}

