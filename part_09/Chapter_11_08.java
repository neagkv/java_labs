package part_09;

// Make the TickTock class actually keep time.

class TickTock {

    String state;

    synchronized void tick(boolean running) {

        if (!running) {

            state = "Ticked";

            notify();

            return;
        }

        else {

            System.out.print("Tick ");
        }


        try {

            Thread.sleep(500);

        } catch (InterruptedException exc) {

            System.out.println("Thread interrupted.");
        }

        state = "ticked";

        notify();

        try {

            while (!state.equals("tocked"))

                wait();

        } catch (InterruptedException exc) {

            System.out.println("Thread interrupted.");
        }
    }

    synchronized void tock(boolean running) {

        if (!running) {

            state = "tocked";

            notify();

            return;
        }
        else {

            System.out.println("Tock");
        }


        try {

            Thread.sleep(500);

        } catch (InterruptedException exc) {

            System.out.println("Interrupted Exception");
        }

        state = "tocked";

        notify();

        try {

            while (!state.equals("ticked"))

                wait();

        } catch (InterruptedException exc) {

            System.out.println("Interrupted Exception.");
        }
    }
}