// You are given a date. You just need to write the method, getDay, which returns the day on that date.
// To simplify your task, we have provided a portion of the code in the editor.
// For example, if you are given the date August 14th 2017 , the method should return MONDAY
// as the day on that date.
// Input Format
//  A single line of input containing the space separated month, day and year, respectively, in    format.
// Constraints
//  2000 < year < 3000
// Output Format
//  Output the correct day in capital letters.

import java.io.*;

import java.util.*;

class Result {

    public static String findDay(int month, int day, int year) {

        Calendar calendar = new GregorianCalendar(year, month - 1, day);
        int a = calendar.get(Calendar.DAY_OF_WEEK);
        String d= "";

        if (a == 2) d = "MONDAY";
        if (a == 3) d = "TUESDAY";
        if (a == 4) d = "WEDNESDAY";
        if (a == 5) d = "THURSDAY";
        if (a == 6) d = "FRIDAY";
        if (a == 7) d = "SATURDAY";
        if (a == 1) d = "SUNDAY";

        return d;
    }

}

public class JavaDateAndTime {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}