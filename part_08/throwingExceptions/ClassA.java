package part_08.throwingExceptions;

public class ClassA {

    public static void main(String[] args) {

        ClassB objectB = new ClassB();


        try {
            objectB.divideByZero();

        } catch (IllegalArgumentException hamster) {
            System.out.println("The exception was caught");
        }

        

    }

}
