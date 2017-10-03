package part_03;

/**

 Write a class that has at least 3 methods, one of which being a main() method. The two other methods need to use the
 "return" keyword. Use the values returned from these two methods to accomplish a task.

 */

class ReturnDemo {

    int firstReturn() {
        int i;
        for (i = 0; i <= 100; i++) {
            if (i == 35)
                break;
        }
        return i;
    }

    int secondReturn() {
        int j;
        for (j = 200; j > 0; j = -2) {
            if (j == 194)
                break;
        }
        return j;
    }

    public static void main(String[] args) {
        ReturnDemo rt = new ReturnDemo();
        int i = rt.firstReturn();
        int j = rt.secondReturn();
        System.out.println(i + j);
    }
}
