package part_04;

/**

 Implement, and populate a non-circular, consumptive queue (once a value has been retrieved
 it cannot be retrieved again) of integers 0 through 100. Then print out every other
 value in the queue.

 expected output: 0,2,4,6,8.....100

 */

public class Exercise_06 {

    char queue[]; // this array holds the queue
    int putloc, getloc; // the put and get indices

    Queue(int size) {
        q = new char[size]; // allocate memory for queue
        putloc = getloc = 0;
    }

    // put a character into the queue
    void put(char ch) {
        if(putloc ==q.length) {
            System.out.println("- Queue is full");
            return;
        }
        q[putloc++] = ch;

    }

}

    // Demonstarte the Queue class.
class QDemo {
    public static void main(String args[]) {
        Queue big
    }
    }