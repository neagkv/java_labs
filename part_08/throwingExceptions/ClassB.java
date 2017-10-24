package part_08.throwingExceptions;

public class ClassB {

    //create a divideby zero method that throws an illegal argument exception
    public void divideByZero() throws IllegalArgumentException{

        //the method prints out divide by zero
        System.out.println("Divide by zero");
        //when this occurs the method throws the illegal arugemtn exception and the prints divisor is zero
        throw new IllegalArgumentException("Argument 'divisor' is 0");


    }
}
