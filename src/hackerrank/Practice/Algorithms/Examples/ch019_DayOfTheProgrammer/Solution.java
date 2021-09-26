package hackerrank.Practice.Algorithms.ch019_DayOfTheProgrammer;

import java.io.*;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

class Result {

    /*
     * Complete the 'dayOfProgrammer' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER year as parameter.
     */

    public static String dayOfProgrammer(int year) {
        // Write your code here
        String date = "";

        // variant 1
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        Calendar c = Calendar.getInstance();
        try {
            c.setTime(sdf.parse("01.01." + year)); // 256 - 1 = 255
        } catch (ParseException e){
            e.printStackTrace();
        }
        int dayOfYear = 255;
        if (year == 1918) {
            dayOfYear += 13; // increase date by 13 in 1918 manualy
        // in Julian calendar we need to ignore rule of Gregorian calendar "not divisible by 100"
        } else if (year < 1918 && year % 4 == 0 && year % 100 == 0) {
            dayOfYear--;
        }
        c.add(Calendar.DAY_OF_YEAR, dayOfYear); // we've already had 1 day (01.01.XXXX) that's why 255, not 256

//        // variant 2
//        if (year < 1918 && year % 4 == 0) {
//            date = "12.09." + year;
//        } else if (year > 1918 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
//            date = "12.09." + year;
//        } else if (year == 1918) {
//            date = "26.09." + year;
//        } else {
//            date = "13.09." + year;
//        }

        return date;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.dayOfProgrammer(year);

//        bufferedWriter.write(result);
//        bufferedWriter.newLine();

        System.out.println(result);
        bufferedReader.close();

//        bufferedWriter.close();
    }
}

/*
Sample Input 0
2017
Sample Output 0
13.09.2017

Sample Input 1
2016
Sample Output 1
12.09.2016

Sample Input 2
1800
Sample Output 2
12.09.1800

 */