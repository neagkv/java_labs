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


        if (myFile.exists()) {

            System.out.println(sdf.format(myFile.lastModified()));
            System.out.println(myFile.canWrite());
            System.out.println();


            boolean success = myFile.setReadOnly();
            if (success) {
                System.out.println("Successfully set file into read only");
            } else {
                System.out.println("Setting the file to read only is not successful");
            }
        } else{
                System.out.println("File does not exist");
            }

            System.out.println(myFile.canWrite());
            System.out.println("Can no longer write to file");
        }

    }









