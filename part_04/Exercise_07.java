package part_04;


import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/* The complement of a queue is a stack. It uses first-in, last-out accesssing and is often likened to a stack of plates.
The first plate put on the table is the last plate used. Create a stack class called Stack that can hold characters. Call
the method that access the stack push() and pop(). Allow the user to specify the size of the stack when it is created.
Keep all other members of the Stack class private.
 */



class Exercise_07 {

    public static void main(String[] strings) throws java.io.IOException {   //main method. starts program

        System.out.println("Enter a number");                               //prompt to enter a number
        Scanner input = new Scanner(System.in);                            //scans in an int
        int size = input.nextInt();                                       //sets size equal to the input
        Stack test = new Stack(size);                   //new stack object that takes user input as parameter

        test.push('c');                             //the push method on the test object that takes c as a parameter
        System.out.println(test.pop());                 // will print out the char at the location of the pop


    }
}



class Stack {


    private char s[];               //this array holds the stack
    private int pushloc, poploc;    //the push and pop indices


    Stack( int size) {              //constructor for an empty stack
        s = new char[size];         //creates a new char array with the size of the user input and name s
        pushloc = poploc = 0;       // sets the push and pop location to zero. start of the stack
    }

    public void push(char ch) {                           // push method takes the parameter ch
        if (pushloc == s.length) {                       // if the pushlocation equals the size of the stack
            System.out.println("-Stack is full");       //  print stack if full
            return;                                     // breaks out of method


        }                          // if the pushlocation does not equal the length of the stack
        s[pushloc++] = ch;        // the pushlocation in the index of array s is incremented and set = to ch
        poploc++;                 // the poplocation is incremented
        return;                   // breaks out of the push method
    }


    public char pop() {                                  // the pop method that returns a char
        if (pushloc == 0) {                             // if pushlocation = 0
            System.out.println("-Stack is empty");      //print stack is empty
            return (char)0;                             //return 0 casted as a char and break out of the method

        }

        pushloc--;         // if the pushlocation does not equal 0, decrement the push location

         return s[--poploc];        //and return 1- the poplocation of the index of the s array

}

}
