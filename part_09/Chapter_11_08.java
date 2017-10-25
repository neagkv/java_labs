package part_09;

//8. Change the TickTock class so that it actually keeps time. That is, have each tick take one half second, and each tock
//take one half second. Thus, each tick-tock will take one second. (Don?t worry about the time it takes to switch tasks, etc.)

public class Chapter_11_08 {

    String state;

    synchronized void tick(boolean running) {
        if(!running) {
            state = "ticked";
            notify();
            return;

        }
        System.out.println("Tick ");

        state = "Ticked";

        notify();
        try{
            while(!state.equals("tocked"))
                wait();
        }
        catch (InterruptedException exc) {
            System.out.println("Thread Interrupted.");
        }
    }
    synchronized void tock(boolean running) {
        if(!running) {
            state = "tocked";
            notify();
            return;
        }

        System.out.println("Took");

        state = "tocked";

        notify();
        try{
            while (!state.equals("ticked"))
                wait();
        }
        catch(InterruptedException exc) {
            System.out.println("Thread interrupted");
        }
    }

}


class MyThread implements Runnable {
    Thread thrd;
    Chapter_11_08 obj;

    MyThread(String name, Chapter_11_08 tt) {
        thrd = new Thread(this, name );
        obj = tt;
        thrd.start();
    }

    public void run() {
        if(thrd.getName().compareTo("Tick")==0) {
            for(int i=0; i<5; i++) obj.tick(true);
            obj.tick(false);
        }
        else {
            for(int i =0; i<5; i++) obj.tock(true);
            obj.tock(false);
        }
    }
}

class ThreadCom {
    public static void main(String args[]) {
        Chapter_11_08 tt = new Chapter_11_08();
        MyThread mt1 = new MyThread("Tick", tt);
        MyThread mt2 = new MyThread("Tock", tt);

        try{
            mt1.thrd.join();
            mt2.thrd.join();

        } catch(InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }
    }
}