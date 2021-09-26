package hackerrank.Practice.Algorithms.ch048_EqualityInAArray;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

class Result {

    /*
     * Complete the 'equalizeArray' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int equalizeArray(List<Integer> arr) {
        // Write your code here
//        //VARIANT 1
//        Map<Integer, Long> map = arr.stream().collect(groupingBy(Integer::intValue, counting()));
//        int maxCount = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getValue().intValue();
//        return arr.size() - maxCount;

//        VARIANT 2
        Collections.sort(arr);
        int maxVal = arr.get(arr.size() - 1);
        int maxOccurence = 0;
        for (int i = arr.size() - 1; i >= 0; i--) {
            if (arr.get(i) == maxVal) maxOccurence++;
            else break;
        }
        return arr.size() - maxOccurence;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.equalizeArray(arr);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        System.out.println(result);
        bufferedReader.close();
//        bufferedWriter.close();
    }
}


/*
Sample Input 0

STDIN       Function
-----       --------
5           arr[] size n = 5
3 3 2 1 3   arr = [3, 3, 2, 1, 3]
Sample Output
2
 */