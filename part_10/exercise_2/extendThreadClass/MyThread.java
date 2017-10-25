package part_10.exercise_2.extendThreadClass;

public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName());

    }
}



