package hackerrank.Practice.Algorithms.ch049_QueensAttack2;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'queensAttack' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER r_q
     *  4. INTEGER c_q
     *  5. 2D_INTEGER_ARRAY obstacles
     */

    private static int
            dirTL = Integer.MAX_VALUE,
            dirT = Integer.MAX_VALUE,
            dirTR = Integer.MAX_VALUE,
            dirR = Integer.MAX_VALUE,
            dirBR = Integer.MAX_VALUE,
            dirB = Integer.MAX_VALUE,
            dirBL = Integer.MAX_VALUE,
            dirL = Integer.MAX_VALUE;

    public static int calculateDistance(int dr, int dc, int or, int oc, int qr, int qc, int dist) {
        int calc = 0;
        if (dr == 0 || dc == 0) {
            calc = Math.max((or - qr) * dr, (oc - qc) * dc) - 1; // T|B|L|R
        } else {
            calc = Math.min((or - qr) * dr, (oc - qc) * dc) - 1; // TL|TR|BL|BR
        }
        return Math.min(calc, dist);
    }

    public static int queensAttack(int n, int k, int r_q, int c_q, List<List<Integer>> obstacles) {
        // Write your code here

        // removing offset obstacles
        for (int i = 0; i < obstacles.size(); i++) {
            int shiftRow = Math.abs(obstacles.get(i).get(0) - r_q);
            int shiftCol = Math.abs(obstacles.get(i).get(1) - c_q);
            if (shiftRow != 0 && shiftCol != 0 && shiftRow - shiftCol != 0) {
                obstacles.remove(obstacles.get(i));
                i--;
            }
        }

        //calculating distances to borders in 8 directions: top-left, top, top-right, etc.
        dirTL = calculateDistance(1, -1, n+1, 0, r_q, c_q, dirTL);
        dirT = calculateDistance(1, 0, n+1, 0, r_q, c_q, dirT);
        dirTR = calculateDistance(1, 1, n+1, n+1, r_q, c_q, dirTR);
        dirR = calculateDistance(0, 1, 0, n+1, r_q, c_q, dirR);
        dirBR = calculateDistance(-1, 1, 0, n+1, r_q, c_q, dirBR);
        dirB = calculateDistance(-1, 0, 0, 0, r_q, c_q, dirB);
        dirBL = calculateDistance(-1, -1, 0, 0, r_q, c_q, dirBL);
        dirL = calculateDistance(0, -1, n+1, 0, r_q, c_q, dirL);

        //compare with distances to obstacles
        for (int i = 0; i < obstacles.size(); i++) {
            int oRow = obstacles.get(i).get(0); // obstacle's row
            int oCol = obstacles.get(i).get(1); // obstacle's column
            // convert to -1 | 1 and avoid ArithmeticException (division by zero)
            int dirRow = (oRow - r_q == 0) ? 0 : (oRow - r_q) / Math.abs(oRow - r_q);
            int dirCol = (oCol - c_q == 0) ? 0 : (oCol - c_q) / Math.abs(oCol - c_q);

            // recalculate distance
            if (dirRow == 1 && dirCol == -1) {
                dirTL = calculateDistance(dirRow, dirCol, oRow, oCol, r_q, c_q, dirTL);
            } else if (dirRow == 1 && dirCol == 0) {
                dirT = calculateDistance(dirRow, dirCol, oRow, oCol, r_q, c_q, dirT);
            } else if (dirRow == 1 && dirCol == 1) {
                dirTR = calculateDistance(dirRow, dirCol, oRow, oCol, r_q, c_q, dirTR);
            } else if (dirRow == 0 && dirCol == 1) {
                dirR = calculateDistance(dirRow, dirCol, oRow, oCol, r_q, c_q, dirR);
            } else if (dirRow == -1 && dirCol == 1) {
                dirBR = calculateDistance(dirRow, dirCol, oRow, oCol, r_q, c_q, dirBR);
            } else if (dirRow == -1 && dirCol == 0) {
                dirB = calculateDistance(dirRow, dirCol, oRow, oCol, r_q, c_q, dirB);
            } else if (dirRow == -1 && dirCol == -1) {
                dirBL = calculateDistance(dirRow, dirCol, oRow, oCol, r_q, c_q, dirBL);
            } else if (dirRow == 0 && dirCol == -1) {
                dirL = calculateDistance(dirRow, dirCol, oRow, oCol, r_q, c_q, dirL);
            }
        }

        return dirTL + dirT + dirTR + dirR + dirBR + dirB + dirBL + dirL;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int r_q = Integer.parseInt(secondMultipleInput[0]);

        int c_q = Integer.parseInt(secondMultipleInput[1]);

        List<List<Integer>> obstacles = new ArrayList<>();

        IntStream.range(0, k).forEach(i -> {
            try {
                obstacles.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.queensAttack(n, k, r_q, c_q, obstacles);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        System.out.println(result);
        bufferedReader.close();
//        bufferedWriter.close();
    }
}

