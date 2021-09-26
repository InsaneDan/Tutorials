package hackerrank.Practice.Algorithms.ch054_BiggerIsGreater;

import java.io.*;
import java.util.stream.*;

// Next (and previous!) lexicographical permutation algorithm
// https://www.nayuki.io/page/next-lexicographical-permutation-algorithm
class Result {

    /*
     * Complete the 'biggerIsGreater' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING w as parameter.
     */

    public static String biggerIsGreater(String w) {
        // convert to array of chars
        char[] arr = w.toCharArray();
        // the element before the greatest from the end
        int i = arr.length - 1;
        while (i > 0 && arr[i - 1] >= arr[i]) i--;
        if (i <= 0) return "no answer";
        // the first element less than picked before
        int j = arr.length - 1;
        while (arr[j] <= arr[i - 1]) j--;
        // swap these elements
        char temp = arr[i - 1];
        arr[i - 1] = arr[j];
        arr[j] = temp;
        // reverse the rest
        j = arr.length - 1;
        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : arr) stringBuilder.append(c);
        return stringBuilder.toString();
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int T = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, T).forEach(TItr -> {
            try {
                String w = bufferedReader.readLine();

                String result = Result.biggerIsGreater(w);
                System.out.println(result);
//                bufferedWriter.write(result);
//                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
//        bufferedWriter.close();
    }
}

/*
Sample Input 0
5
ab
bb
hefg
dhck
dkhc
Sample Output 0
ba
no answer
hegf
dhkc
hcdk

Sample Input 1
6
lmno
dcba
dcbb
abdc
abcd
fedcbabcd
Sample Output 1
lmon
no answer
no answer
acbd
abdc
fedcbabdc

Test case Input
1
zzzayybbaa
Test case Output
zzzbaaabyy
 */