package hackerrank.Practice.Algorithms.ch027_PickingNumbers;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(List<Integer> a) {
        // Write your code here

//        // VARIANT #1
//        // trying all sequences
//        List<List<Integer>> arrs = new ArrayList<>();
//        for (int i = 0; i < a.size(); i++) {
//            List<Integer> sequenceGreater = new ArrayList<>();
//            List<Integer> sequenceLess = new ArrayList<>();
//            for (int j = i; j < a.size(); j++) {
//                if (sequenceGreater.size() == 0) {
//                    sequenceGreater.add(a.get(j));
//                    sequenceLess.add(a.get(j));
//                    continue;
//                }
//                if (Math.abs(a.get(j) - a.get(i)) <= 1 && a.get(j) >= a.get(i)) sequenceGreater.add(a.get(j));
//                if (Math.abs(a.get(j) - a.get(i)) <= 1 && a.get(j) <= a.get(i)) sequenceLess.add(a.get(j));
//            }
//            arrs.add(sequenceGreater);
//            arrs.add(sequenceLess);
//        }
//        int maxRes = 0;
//        // calculating longest sequence
//        for (List<Integer> arr : arrs) {
//            if (arr.size() > maxRes) maxRes = arr.size();
//        }
//        return maxRes;

////        VARIANT #2
//        Map<Integer, Integer> map = new HashMap<>();
//        for (Integer el : a) {
//            if (!map.containsKey(el)) {
//                map.put(el, 1);
//            } else {
//                map.replace(el, map.get(el) + 1);
//            }
//        }
//        int maxRes = 0;
//        for (Integer val : map.keySet()) {
//            int localRes = map.get(val);
//            if (map.containsKey(val + 1)) localRes += map.get(val + 1);
//            if (maxRes < localRes) maxRes = localRes;
//        }
//        return maxRes;

//        VARIANT #3
        Set<Integer> set = new HashSet<>(a);
        int maxRes = 0;
        for (Integer el : set) {
            int localRes = Collections.frequency(a, el) + Collections.frequency(a, el+1);
            if (maxRes < localRes) maxRes = localRes;
        }
        return maxRes;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.pickingNumbers(a);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        System.out.println(result);
        bufferedReader.close();
//        bufferedWriter.close();
    }
}

/*
Example Input
9
1 1 2 2 4 4 5 5 5
Example Output
5

Sample Input 0
6
4 6 5 3 3 1
Sample Output 0
3

Sample Input 1
6
1 2 2 3 1 2
Sample Output 1
5

Input (stdin)
73
4 2 3 4 4 9 98 98 3 3 3 4 2 98 1 98 98 1 1 4 98 2 98 3 9 9 3 1 4 1 98 9 9 2 9 4 2 2 9 98 4 98 1 3 4 9 1 98 98 4 2 3 98 98 1 99 9 98 98 3 98 98 4 98 2 98 4 2 1 1 9 2 4
Expected Output
22

Input
100
100 4 97 5 97 97 4 97 4 97 97 97 97 4 4 5 5 97 5 97 99 4 97 5 97 97 97 5 5 97 4 5 97 97 5 97 4 97 5 4 4 97 5 5 5 4 97 97 4 97 5 4 4 97 97 97 5 5 97 4 97 97 5 4 97 97 4 97 97 97 5 4 4 97 4 4 97 5 97 97 97 97 4 97 5 97 5 4 97 4 5 97 97 5 97 5 97 5 97 97 97
Output
50
 */