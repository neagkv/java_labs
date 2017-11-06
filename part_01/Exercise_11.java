package part_01;

/**
 * Part 1 Exercise 11:
 *      In the U.S., if there is:
 *          - One person who is born every 6 seconds
 *          - One person who dies every 12 seconds
 *          - One person who immigrates every 40 seconds
 *
 *      Write the necessary code to display the total population for the next 3 years (without a leap year)
 *
 *      Let's say the current population is 380,123,456.
 *
 */

public class Exercise_11 {

    public static void main(String[] strings) {

        double secsperday=(24*60*60);
        double totalbornperday=(secsperday/6);
        double totaldiesperday=(secsperday/12);
        double totalimmigratesperday=(secsperday/40);
        double changeuspopperday=(totalbornperday + totalimmigratesperday - totaldiesperday);
        //casted changuspopperday to a long
        long change = (long) changeuspopperday;
        long changeper3= change*365*3;
        long Totaluspop= changeper3 + 380123456;

        System.out.println("US population equals" + " " + Totaluspop + " After 3 years");
    }
}