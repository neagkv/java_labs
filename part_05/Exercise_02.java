package part_05;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Write two classes. In Class_01 (which contains the main()) create an instance of Class_02 and pass that instance
 * to a method_01 within Class_01. Within method_01 you ust manipulate several private instance variables within
 * Class_02. Then, from within method_01, pass the instance of Class_02 to a new method, method_02. Within method_02
 * modify the instance variables of Class_02 once again. Use System.out.println at various points to demonstrate the
 * flow of execution and the varying state of each private variable. You can name these classes whatever you want.
 *
 */
//Then, from within method_01, pass the instance of Class_02 to a new method, method_02

class  City_New_York {



    private int population;
    private int skyscrapers;

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getSkyscrapers() {
        return skyscrapers;
    }

    public void setSkyscrapers(int skyscrapers) {
        this.skyscrapers = skyscrapers;
    }
}


class New_York{


    public static void main(String[] args) {

        City_New_York nyc = new City_New_York();
        nyc.setPopulation(80000);
        nyc.setSkyscrapers(200);
        System.out.println("The orginal population of New York is" + " " +nyc.getPopulation());
        System.out.println("The orginal # of skyscrapers in New York is" + " " + nyc.getSkyscrapers());
        asteroid(nyc);
        System.out.println("After the Asteroid the population is" + " " + nyc.getPopulation());
        System.out.println("After the Asteroid the # of skyscrapers is " + " " + nyc.getSkyscrapers());
        flood(nyc);
        System.out.println("After the Flood the population is" + " " + nyc.getPopulation());

    }

    public static void asteroid(City_New_York a) {

        a.setPopulation(a.getPopulation() - 5000);
        a.setSkyscrapers(a.getSkyscrapers() -150);

    }

    public static void flood(City_New_York b) {
        b.setPopulation(b.getPopulation() - 27);
    }





    }

