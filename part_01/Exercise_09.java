package part_01;

/**
 * Part 1 Exercise 9:
 *
 *      Write the necessary code to display the area of a rectangle, as well as the perimeter of
 *      a rectangle that has a width of 2.4 and a height of 6.4
 *
 */
public class Exercise_09 {

    static double width = 2.4;
    static double height = 6.4;


    public static void main(String[] strings) {

        double area;
        double perimeter;

        System.out.println("Area euqals" + " " + width * height);

        System.out.println("Perimeter equals" + " " + 2*(width + height));

    }
}