package part_01;

/**
 * Part 1 Exercise 10:
 *
 *      If a runner runs 12 kilometers in 30 minutes and 30 seconds. What is his/her average speed
 *      in miles per hour. (Tip: 1 mile = 1.6 km)
 *
 */

public class Exercise_10 {

    public static void main(String[] strings) {
        double distance=12;
        double time=30.5;
        double milesran=(distance/1.6);
        double timeperhour=(time/60);
        System.out.println(milesran);
        System.out.println(timeperhour);
        double milesperhour=((milesran)/(timeperhour));
        System.out.println("The runner's time in mi/hr equals" + " " + milesperhour);
        //...

    }

}