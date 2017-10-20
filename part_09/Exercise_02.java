package part_09;
//Demonstrate how to read file using BufferedInputStream - print each byte - be sure to close all connections

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Exercise_02 {
    public static void main(String[] args) {

        try {


            FileInputStream stremer = new FileInputStream("//Jialor's Favoriet Poems.txt");
            BufferedInputStream bufferedStremer = new BufferedInputStream(stremer);


            int i;
            while ((i = bufferedStremer.read()) != -1) {
                System.out.println((char) i);

            }

            stremer.close();
            bufferedStremer.close();
        }

        catch(Exception e) {
            System.out.println(e);
        }
    }

}
