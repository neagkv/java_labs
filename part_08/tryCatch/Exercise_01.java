package part_08.tryCatch;

public class Exercise_01 {

    public static void main(String[] args) {

        int a, b;


        try {

            //place this statement inside the try block, because we believe the error occurs here

            a = 0;
            b = 365 / a;
            System.out.println(b);
            System.out.println("End of try block");
        }

        catch (ArithmeticException e) {

            // This block will only execute if the arithmetic exception executes

            System.out.println("you attempted to divide by zero");
        }

        catch (Exception e){

            // generic handler that can handle all exceptions
            // will only execute if the exception is not previously executed

            System.out.println("Exception Occurred");
        }

        //confirms that the program continued after reaching the exception
        System.out.println("You have reached the end of the main method");
    }

}


