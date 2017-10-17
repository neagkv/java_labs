package part_01;

/**
 * Part 1 Exercise 8:
 *
 *      Write the necessary code that prints out the area
 *      and perimeter of a circle with a radius of 3.14
 *
 *
 */
public class Exercise_08 {

    private static final double radius = 3.14;

    public static void main(String[] args) {
        double perimeter;
        double area;
        System.out.println("Perimeter equals" + " " + 2*radius*(22/7));
        System.out.println("area equals" + " " + (radius*radius*Math.PI));
        //...
    }
}
