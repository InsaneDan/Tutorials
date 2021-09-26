package hackerrank.Practice.Algorithms.ch010_TimeConversion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        String time = "";
//        String[] arr = s.split(":");
//        int hours = Integer.parseInt(arr[0]);
//
//        if (s.contains("AM")) {
//            if (hours == 12) hours = 0;
//            arr[2] = arr[2].replace("AM", "");
//        } else if (s.contains("PM")) {
//            hours += 12;
//            if (hours == 24) hours = 12;
//            arr[2] = arr[2].replace("PM", "");
//        }
//        arr[0] = String.format("%02d", hours);
//        time = String.join(":", arr);

        SimpleDateFormat time12 = new SimpleDateFormat("hh:mm:ssa");
        SimpleDateFormat time24 = new SimpleDateFormat("HH:mm:ss");
        try {
            time = time24.format(time12.parse(s));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return time;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        System.out.println(result);
        bufferedReader.close();
//        bufferedWriter.close();
    }
}

/*
Function Description
string s: a time in 12-hour format
Returns
string: the time in 24-hour format

Input Format
A single string  that represents a time in 12-hour clock format (i.e.: hh:mm:ssAM or hh:mm:ssPM).

Constraints
All input times are valid

Sample Input 0
07:05:45PM
Sample Output 0
19:05:45

Input (stdin)
12:40:22AM
Expected Output
00:40:22

Input (stdin)
12:45:54PM
Expected Output
12:45:54


*/