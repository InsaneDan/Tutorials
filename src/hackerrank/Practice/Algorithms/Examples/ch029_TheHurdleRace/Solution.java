package hackerrank.Practice.Algorithms.ch029_TheHurdleRace;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'hurdleRace' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY height
     */

    public static int hurdleRace(int k, List<Integer> height) {
        // Write your code here
        int max = height.stream().mapToInt(v -> v).max().orElse(0);
        return Math.max(max - k, 0);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().trim().split(" ");
        int n = Integer.parseInt(firstMultipleInput[0]);
        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> height = Stream.of(bufferedReader.readLine().trim().split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.hurdleRace(k, height);

        System.out.println(result);
        bufferedReader.close();
    }
}


/*
Example Input
1 1
1 2 3 3 2
Example Output
2

Sample Input 0
5 4
1 6 3 5 2
Sample Output 0
2

Sample Input 1
5 7
2 5 4 5 2
Sample Output 1
0

 */