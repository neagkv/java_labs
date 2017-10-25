package part_10.trafficLight;

enum TrafficLightColor {
    RED(12000), GREEN(10000), YELLOW(2000);

    private int delay;

    TrafficLightColor(int d) {
        d = delay;
    }

    public int getDelay() {
        return delay;
    }


}

public class TrafficLightSimulator implements Runnable {

    private Thread thrd;
    private TrafficLightColor tlc;
    boolean stop = false;
    boolean changed = false;


    TrafficLightSimulator(TrafficLightColor init) {
        tlc = init;

        thrd = new Thread(this);
        thrd.start();
    }

    TrafficLightSimulator(){
        tlc = TrafficLightColor.RED;

        thrd = new Thread(this);
        thrd.start();
    }

    @Override
    public void run() {
        while(!stop) {

            // Notice how this code has been simplified!
            try {
                Thread.sleep(tlc.getDelay());
            } catch(InterruptedException exc) {
                System.out.println(exc);
            }

            changeColor();
        }
    }

    synchronized void changeColor() {
        switch(tlc) {
            case RED:
                tlc = TrafficLightColor.GREEN;
                break;
            case YELLOW:
                tlc = TrafficLightColor.RED;
                break;
            case GREEN:
                tlc = TrafficLightColor.YELLOW;

        }

        changed = true;
        notify();
    }

    synchronized void waitForChange() {
        try {
            while(!changed)
                wait();
            changed = false;
        } catch(InterruptedException exc) {
            System.out.println(exc);
        }
    }

    synchronized TrafficLightColor getColor() {
        return tlc;
    }

    synchronized void cancel() {
        stop = true;
    }
}
