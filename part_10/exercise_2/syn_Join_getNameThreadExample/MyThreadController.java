package part_10.exercise_2.syn_Join_getNameThreadExample;

public class MyThreadController {

    String a;
    String b;
    String c;

    public static void main(String[] args) {

        System.out.println("Starting Thread");

        MyThread myt1 = new MyThread("111");
        MyThread myt2 = new MyThread("222");
        MyThread myt3 = new MyThread("333");
        MyThread myt4 = new MyThread("444");



        System.out.println("Run Complete");

    }
}
