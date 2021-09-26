package hackerrank.Practice.Algorithms.ch015_BreakingBestAndWorstRecords;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        int minCounter, maxCounter, minVal, maxVal;
        minCounter = maxCounter = 0;
        minVal = maxVal = scores.get(0);
        for (Integer score : scores) {
            if (score > maxVal) {
                maxVal = score;
                maxCounter++;
            } else if (score < minVal) {
                minVal = score;
                minCounter++;
            }
        }
        List<Integer> res = new ArrayList<>();
        res.add(maxCounter);
        res.add(minCounter);
        return res;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.breakingRecords(scores);

//        bufferedWriter.write(
//                result.stream()
//                        .map(Object::toString)
//                        .collect(joining(" "))
//                        + "\n"
//        );
        System.out.println(result.get(0) + " " + result.get(1));
        bufferedReader.close();
//        bufferedWriter.close();
    }
}


/*

Sample Input 0
9
10 5 20 20 4 5 2 25 1
Sample Output 0
2 4

Sample Input 1
10
3 4 21 36 10 28 35 5 24 42
Sample Output 1
4 0

 */