package hackerrank.Practice.Algorithms.ch044_CutTheSticks;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'cutTheSticks' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    private static List<Integer> res = new ArrayList<>();
    public static List<Integer> cutTheSticks(List<Integer> arr) {
        // Write your code here
        if (arr.size() >= 1) {
            res.add(arr.size());
            int min = arr.stream().mapToInt(Integer::intValue).min().getAsInt();
            arr.removeIf(val -> val == min);
            cutTheSticks(arr);
        }
        return res;
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

        List<Integer> result = Result.cutTheSticks(arr);

//        bufferedWriter.write(
//                result.stream()
//                        .map(Object::toString)
//                        .collect(joining("\n"))
//                        + "\n"
//        );

        result.forEach(System.out::println);
        bufferedReader.close();
//        bufferedWriter.close();
    }
}

/*
Входные данные
8
1 2 3 4 3 3 2 1
Выходные данные
8
6
4
1

Input (stdin)
6
5 4 4 2 2 8
Output (stdout)
6
4
2
1

 */