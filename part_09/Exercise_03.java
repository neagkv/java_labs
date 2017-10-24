package part_09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Demonstrate how to read file using BufferedReader - demonstrate both the read() and readLine() methods()
//be sure to close all connections

public class Exercise_03 {

    public static void main(String[] args) {

        //declare a reference to the bufferedreader object
        BufferedReader br = null;

        //try block to catch the IO exception
        try{
            //point the buffered reader to sometextfile wraped around the filereader
           br = new BufferedReader(new FileReader("sometextfile.txt"));

           //declare a new line string set equal to the the readline method on br
            String newLine = br.readLine();

            //while the newline is not null
            while(newLine != null){
                //print out the newline
                System.out.println(newLine);
                //reset newLine to the readline method on br to print the next line
                newLine = br.readLine();

            }

            // create an int and set it equal to the read method on br to read a the file byte by byte
            int a = br.read();

            //while a is not equal to zero
            while(a != 0){
                //print out a
                System.out.println(a);
                //set a equal to the readline method agaon to print out the next byte
                a = br.read();
            }


        }
        //catch the IO excpetion
        catch (IOException ioe){

        }


    }
}
