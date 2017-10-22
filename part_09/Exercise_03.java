package part_09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Demonstrate how to read file using BufferedReader - demonstrate both the read() and readLine() methods()

public class Exercise_03 {

    public static void main(String[] args) {

        BufferedReader br = null;


        try{
           br = new BufferedReader(new FileReader("//sometextfile.txt"));

            String newLine = br.readLine();

            while(newLine != null){

                System.out.println(newLine);

                newLine = br.readLine();

            }


        }

        catch (IOException ioe){

        }


    }
}
