package hackerrank.Practice.Algorithms.ch045_NonDivisibleSubset;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'nonDivisibleSubset' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY s
     */

    // https://www.hackerrank.com/challenges/non-divisible-subset/forum/comments/545233
    public static int nonDivisibleSubset(int k, List<Integer> s) {
        // Write your code here
        // подсчитываем количество элементов, остаток от деления которых на k равен индексу в новом массиве
        int[] arrRemainder = new int[k];
        for (Integer each : s) arrRemainder[each % k]++;
        // из чисел, которые делятся на k, можем взять только одно, если такие числа есть
        int res = arrRemainder[0] > 0 ? 1 : 0;
        // выбираем один элемент из пар, в которых сумма остатков делится на k, и количество элементов больше
        for (int i = 1; i <= (k / 2); i++) {
            if (i != k - i) res += Math.max(arrRemainder[i], arrRemainder[k - i]);
            else res++;
        }

        return res;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.nonDivisibleSubset(k, s);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        System.out.println(result);
        bufferedReader.close();
//        bufferedWriter.close();
    }
}

/*
Sample Input
STDIN    Function
-----    --------
4 3      S[] size n = 4, k = 3
1 7 2 4  S = [1, 7, 2, 4]
Sample Output
3
 */