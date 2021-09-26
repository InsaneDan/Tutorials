package hackerrank.Practice.Algorithms.ch047_JumpingOnTheClouds;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'jumpingOnClouds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY c as parameter.
     */

    public static int jumpingOnClouds(List<Integer> c) {
        // Write your code here
//        int res = -1;
//        for (int i = 0; i < c.size(); i++, res++) {
//            if (i < c.size() - 2 && c.get(i + 2) == 0) i++;
//        }

        int res = 0;
        for (int i = 0; i < c.size() - 1; i++, res++)
            if (c.get(i) == 0) i++;
        return res;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> c = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.jumpingOnClouds(c);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        System.out.println(result);
        bufferedReader.close();
//        bufferedWriter.close();
    }
}

/*
Sample Input 0
7
0 0 1 0 0 1 0
Sample Output 0
4

Sample Input 1
6
0 0 0 0 1 0
Sample Output 1
3
 */