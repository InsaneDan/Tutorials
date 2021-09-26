package hackerrank.Practice.Algorithms.ch022_DrawingBook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'pageCount' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER p
     */

    public static int pageCount(int n, int p) {
        // Write your code here
        if (n % 2 == 0) n++;
        if (p % 2 == 1) p--;
        return Math.min(p / 2, (n - p) / 2);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int p = Integer.parseInt(bufferedReader.readLine().trim());
        int result = Result.pageCount(n, p);

        System.out.println(result);
        bufferedReader.close();
    }
}


/*
Example Input
5
3
Example Output
1

Sample Input 0
6
2
Sample Output 0
1

Sample Input 1
5
4
Sample Output 1
0

 */