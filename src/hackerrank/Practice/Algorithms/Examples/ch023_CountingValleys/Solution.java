package hackerrank.Practice.Algorithms.ch023_CountingValleys;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int seaLevel = 0, direction, counterValleys = 0;
        for (int i = 0; i < path.length(); i++) {
            direction = (path.charAt(i) == 'D') ? -1 : 1;
            if (seaLevel == 0 && direction == -1) counterValleys++;
            seaLevel += direction;
        }
        return counterValleys;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());
        String path = bufferedReader.readLine();
        int result = Result.countingValleys(steps, path);

        System.out.println(result);
        bufferedReader.close();
    }
}


/*
Example Input
8
DDUUUUDD
Example Output
1

Sample Input
8
UDDDUDUU
Sample Output
1

 */