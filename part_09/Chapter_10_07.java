package part_09;


//7. Write a program that copies a text file. In the process, have it convert all spaces into hyphens.
//Use the byte stream file classes. Use the traditional approach to closing a file by explicitly calling close( ).

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.io.*;

public class Chapter_10_07 {

    public static void main(String[] args) {

        int x;
        FileInputStream input = null;
        FileOutputStream output = null;

        if (args.length != 2) {
            System.out.println("Please enter two arguments");
            return;
        }

        try {
            input = new FileInputStream(args[0]);
            output = new FileOutputStream(args[1]);


        do {
            x = input.read();


            if ((char) x == ' ') x = '-';
            if (x != -1)
                output.write(x);
        }
        while (x != -1);
    }
    catch(IOException e) {

        System.out.println("I/0 Error: " + e);

    } finally

    {
        try {
            if (input != null) input.close();
        } catch (IOException e) {
            System.out.println("Error closing input files");
        }
        try {
            if (input != null) output.close();
        } catch (Exception a) {
            System.out.println("Error closing output file");
        }
    }


    }

}
