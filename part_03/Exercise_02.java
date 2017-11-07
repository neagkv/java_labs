package part_03;

/**

 Write a class that has at least 3 methods, one of which being a main() method. The two other methods need to use the
 "return" keyword. Use the values returned from these two methods to accomplish a task.

 */

class ReturnDemo {

    //first method
    int firstReturn() {


        int i;

        //count up from 0, by 1 to 100
        for (i = 0; i <= 100; i++) {

            if (i == 35)

                //break out of the method when i = 35
                break;
        }
        //return 35
        return i;
    }

    //second method
    int secondReturn() {

        int j;

        //count down by 2, from 200 to zero
        for (j = 200; j > 0; j = -2) {

            if (j == 194)

                //break out of the method when j = 194
                break;
        }

        //return 194
        return j;
    }

    public static void main(String[] args) {

        //return demoObject
        ReturnDemo rt = new ReturnDemo();

        //set variable a equal to the return of the first method
        int a = rt.firstReturn();
        //set variable b equal to the return of the second method
        int b = rt.secondReturn();
        //print out a + b
        System.out.println(a + b);
    }
}
