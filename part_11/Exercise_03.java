package part_11;

/**
 * Modify your Queue Class so that it is completely generic
 */
public class Exercise_03 {

    public static void main(String[] args) {

        Exercise_03.Queue test = new Exercise_03.Queue(101);

        for(int i=0; i<test.size(); i++){
            test.put(i);
        }

        for (int i =0; i <test.size(); i++){
            if(i%2==0) {
                System.out.println(test.get());
            } else if (i%2 !=0) {
                test.get();
            }
        }

    }

    static class Queue <T> {

        private T [] q;
        private int putLocation, getLocation;


        Queue(T size) {
            q = new T [size];
            putLocation = getLocation = 0;
        }

        synchronized public void put(int num) {
            if (putLocation == q.length) {
                System.out.println("-Queue is full");
                return;
            }
            q[putLocation++] = num;
            notify();
            return;
        }

        synchronized public int get() {
            if (getLocation == putLocation) {
                System.out.println("-Queue is empty");
                return 0;
            }
            notify();
            return q[getLocation++];
        }

        public int size() {

            return q.length;
        }
    }
}



