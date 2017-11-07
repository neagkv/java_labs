package part_08.stackException;


import java.util.Scanner;

class Stack {


    private char s[];
    private int pushloc, poploc;


    Stack( int size) {
        s = new char[size];
        pushloc = poploc = 0;
    }

    public void push(char ch) throws StackFull {
        if (pushloc == s.length) {
            System.out.println("-Stack is full");
            return;


        }

        s[pushloc++] = ch;
        poploc++;
        return;
    }

    public char pop() throws StackEmpty {
        if (pushloc == 0) {
            System.out.println("-Stack is empty");
            return (char)0;

        }

        pushloc--;

        return s[--poploc];

    }

}



class StackController {

    public static void main(String[] strings) throws java.io.IOException {

        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        Stack test = new Stack(size);

        try {
            test.push('c');
        } catch (StackFull stackFull) {
            stackFull.printStackTrace();
        }
        try {
            test.push('b');
        } catch (StackFull stackFull) {
            stackFull.printStackTrace();
        }
        try {
            System.out.println(test.pop());
        } catch (StackEmpty stackEmpty) {
            stackEmpty.printStackTrace();
        }


    }
}


