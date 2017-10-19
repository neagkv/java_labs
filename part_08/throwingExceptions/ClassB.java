package part_08.throwingExceptions;

public class ClassB {


    public void divideByZero() throws IllegalArgumentException{

        System.out.println("Divide by zero");

        throw new IllegalArgumentException("Argument 'divisor' is 0");


    }
}
