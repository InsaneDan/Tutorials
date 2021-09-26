package hackerrank.Practice.Algorithms.ch026_MagicSquareForming;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'formingMagicSquare' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY s as parameter.
     */

    public static int formingMagicSquare(List<List<Integer>> s) {
        // Write your code here
        List<List<Integer>> allMagicSquares3x3 = Arrays.asList(
                Arrays.asList( 2, 7, 6, 9, 5, 1, 4, 3, 8 ),
                Arrays.asList( 2, 9, 4, 7, 5, 3, 6, 1, 8 ),
                Arrays.asList( 4, 3, 8, 9, 5, 1, 2, 7, 6 ),
                Arrays.asList( 4, 9, 2, 3, 5, 7, 8, 1, 6 ),
                Arrays.asList( 6, 1, 8, 7, 5, 3, 2, 9, 4 ),
                Arrays.asList( 6, 7, 2, 1, 5, 9, 8, 3, 4 ),
                Arrays.asList( 8, 1, 6, 3, 5, 7, 4, 9, 2 ),
                Arrays.asList( 8, 3, 4, 1, 5, 9, 6, 7, 2 ));

        // convert square into list
        List<Integer> squareList = new ArrayList<>();
        for (int i = 0; i < s.size(); i++) {
            for (int j = 0; j < s.size(); j++) {
                squareList.add(s.get(i).get(j));
            }
        }

        int res = Integer.MAX_VALUE;
        for (int i = 0; i < 8; i++) {
            int sumRow = 0;
            for (int j = 0; j < squareList.size(); j++) {
                sumRow += Math.abs(allMagicSquares3x3.get(i).get(j) - squareList.get(j));
            }
            if (res > sumRow) res = sumRow;
        }

        return res;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<List<Integer>> s = new ArrayList<>();

        IntStream.range(0, 3).forEach(i -> {
            try {
                s.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.formingMagicSquare(s);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        System.out.println(result);
        bufferedReader.close();
//        bufferedWriter.close();
    }
}


/*
Example Input
5 3 4
1 5 8
6 4 2
Example Output
7

Sample Input 0
4 9 2
3 5 7
8 1 5
Sample Output 0
1

Sample Input 1
4 8 2
4 5 7
6 1 6
Sample Output 1
4
 */