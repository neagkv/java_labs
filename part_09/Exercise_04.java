package part_09;


//Bonus questions not covered in book.

//Write a class that can get the date of the last modification, can check whether or not you can write to that file
//and can set a file to read-only.
//Hint, use the "File" class.

import java.io.File;
import java.text.SimpleDateFormat;

public class Exercise_04 {

    public static void main(String[] args) {

        File myFile = new File("/Users/kevinneag/Downloads/county_facts.csv");

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

        System.out.println(sdf.format(myFile.lastModified()));
        System.out.println(myFile.canWrite());


    }
}








