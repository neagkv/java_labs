package part_03;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

class Exercise_06 {

    // the goal of this method is to print out the local time in any given timezone
    public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT (ie, -8 or 8): ");
        long timeZoneChange = input.nextInt();

        // Get total milliseconds since midnight, 1/1/1970
        long totalMilliseconds = System.currentTimeMillis();
        System.out.println(totalMilliseconds);

        // Get total seconds since midnight, 1/1/1970
        long totalSeconds = (System.currentTimeMillis()/1000);
        System.out.println(totalSeconds);

        // Get the current second within the minute within the hour
        long currentSecond = totalSeconds%60;
        System.out.println(totalSeconds);

        // Get total minutes
        long totalMinutes = totalSeconds/60;
        System.out.println(totalMinutes);
        // Get the current minute in the hour
        long currentMinute = totalMinutes%60;
        System.out.println(currentMinute);

        // Get the total hours
        long totalHours = totalMinutes/60;
        System.out.println(totalHours);
        // Get the current hour0
        long currentHour = totalHours%60;
        System.out.println(currentHour);
        // Display results using a 12 hour clock, include AM or PM

        long currentClockHour = (currentHour + timeZoneChange)%24;
        System.out.println(currentClockHour);

        if(currentClockHour <= 12){
            System.out.println(currentClockHour + " " + "PM");
        } else {
            System.out.println((currentClockHour -= 12) + " " + "AM");

        }



    }
}
