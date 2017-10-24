package part_09;
//8. Rewrite the program described in question 7 so that it uses the character stream classes. This time, use the
//try-with-resources statement to automatically close the file.

import java.io.*;

public class Chapter_10_08 {

    public static void main(String[] args) {

        int x;
        FileReader reader = null;
        FileWriter writer = null;



        if (args.length != 2) {
            System.out.println("Please enter two arguments");
            return;
        }

        try {
            reader = new FileReader(args[0]);
            writer = new FileWriter(args[1]);


            do {
                x = reader.read();


                if ((char) x == ' ') x = '-';
                if (x != -1)
                    writer.write(x);
                if (x != -1) writer.write(x);
            } while (x != -1);
        } catch (IOException e) {
            System.out.println("I/0 Error: " + e);
        }
    }
}













