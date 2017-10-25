package part_10.exercise_2.syn_Join_getNameThreadExample;

public class MyThread  implements Runnable{


    Thread thrd;
    String a = "aaaaaaaaaaaaaa";
    String b = "bbbbbbbbbbbbbbb";


    public MyThread(String name) {
        thrd = new Thread(this, name);

        thrd.setPriority(Thread.MAX_PRIORITY);

        thrd.start();
    }


    void changeString(){
        while (a.length() > 0 && b.length() > 0){
           String x = "I changed a";
             String y = "I changed b";
             a = x;
             b = y;
             break;
        }
    }


    @Override
    public void run() {
        changeString();
        System.out.println(thrd.getName());
        System.out.println(a);
        System.out.println(b);
    }
}


