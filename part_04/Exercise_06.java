package part_04;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**

 Implement, and populate a non-circular, consumptive queue (once a value has been retrieved
 it cannot be retrieved again) of integers 0 through 100. Then print out every other
 value in the queue.

 expected output: 0,2,4,6,8.....100

 */

public class Exercise_06 {

    public static void main(String[] args) {

    Queue test = new Queue(101);

    for (int i =0; i <test.size(); i++) {
        test.put(i);
    }


    for (int i ==0; i <test.size(); i++) {
        if(i%2==0) {
            System.out.println(test.get());
        } else if (i%2 !=0) {
            test.get();
        }
        }
    }
}

class Queue {

    private int [] q;
    private int putLocation, getLocation;


    Queue (int a){
        q = new int[a];
        putLocation = getLocation =0;
    }

    public void put(int num) {
        if (putLocation ==q.length) {
            System.out.println("Queue is full");
            return;
        }
        q[putLocation++] = num;
        return;
    }
    public int get() {
        if (getLocation==putLocation) {
            System.out.println("Spot is empty");
            return 0;
        }
        return q[getLocation++];
    }
    public int size(){
        return q.length;
    }
}