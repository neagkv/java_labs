package part_09;
//Demonstrate how to read file using BufferedInputStream - print each byte - be sure to close all connections

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Exercise_02 {

    public static void main(String[] args) {

        try {

            //int stream
            FileInputStream stremer = new FileInputStream("history.txt");

            //char stream that wraps around and int stream
            BufferedInputStream bufferedStremer = new BufferedInputStream(stremer);


            int i;

            //-1 singnafies the end of a file
            while ((i = bufferedStremer.read()) != -1) {

                System.out.println((char) i);

            }
            //When not doing a try with exceptions .. need to close streams manually
            stremer.close();

            bufferedStremer.close();
        }

        catch(Exception e) {

            System.out.println(e);
        }
    }

}
