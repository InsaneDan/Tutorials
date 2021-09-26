package hackerrank.Practice.Algorithms.ch018_MigratoryBirds;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        int resId = -1, resVal = -1;
        Map<Integer, Integer> map = new HashMap<>();
        Integer max = 0;
        for (Integer el : arr) {
            if (!map.containsKey(el)) {
                map.put(el, 1);
            } else {
                map.put(el, map.get(el) + 1);
            }
        }

//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            if (entry.getValue() > resVal) {
//                resVal = entry.getValue();
//                resId = entry.getKey();
//            }
//        }

        resId = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();

        return resId;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.migratoryBirds(arr);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        System.out.println(result);
        bufferedReader.close();
//        bufferedWriter.close();
    }
}



/*

Example Input
5
1 1 2 2 3
Example Output
1

Sample Input 0
6
1 4 4 4 5 3
Sample Output 0
4

Sample Input 1
11
1 2 3 4 5 4 3 2 1 3 4
Sample Output 1
3

 */