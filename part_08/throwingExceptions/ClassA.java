package part_08.throwingExceptions;

public class ClassA {
    //main method
    public static void main(String[] args) {

        //create an object of class b
        ClassB objectB = new ClassB();

        //create a try catch block to catch the exception
        try {
            //calls the divide by zero method on object b
            objectB.divideByZero();

          //  catch the illegal argument exception and print out the exception
        } catch (IllegalArgumentException exe) {
            System.out.println("The exception was caught");
        }

        

    }

}
