package part_10.exercise_2.runnableInterface;

public class MyThread implements Runnable {

    Thread trd = new Thread();

    public MyThread(String name) {
        trd = new Thread(this, name);
        trd.start();

    }

    @Override
    public void run() {
        System.out.println(trd.getName());

    }
}
