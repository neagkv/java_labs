package part_08.stackException;

//Create a custom Stack full exception
public class StackFull extends Exception{

    public StackFull(){

    }

    public String toString() {

        return " Stack Full Exception Error";
    }

}
