package part_09;

//12. On your own, try adding synchronization to the Queue class developed in previous chapters so that it is safe for
//multithreaded use.


class Chapter_11_12 {

    public static void main(String[] args) {

        Chapter_11_12.Queue test = new Chapter_11_12.Queue(101);

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

    static class Queue {

        private int[] q;
        private int putLocation, getLocation;


        Queue(int size) {

            q = new int[size];

            putLocation = getLocation = 0;
        }

        synchronized public void put(int num) {

            if (putLocation == q.length) {

                System.out.println("-Queue is full");

                return;
            }

            q[putLocation++] = num;
            //notifies the get method when task is complete
            notify();

            return;
        }

        synchronized public int get() {

            if (getLocation == putLocation) {

                System.out.println("-Queue is empty");

                return 0;
            }
            //notifies back to the get method when task is comeplete
            notify();

            return q[getLocation++];
        }


        public int size() {

            return q.length;
        }
    }
}