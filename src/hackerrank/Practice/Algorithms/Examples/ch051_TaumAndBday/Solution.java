package hackerrank.Practice.Algorithms.ch051_TaumAndBday;

import java.util.Scanner;

class Result {

    /*
     * Complete the 'taumBday' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER b
     *  2. INTEGER w
     *  3. INTEGER bc
     *  4. INTEGER wc
     *  5. INTEGER z
     */

    public static long taumBday(int b, int w, int bc, int wc, int z) {
        // Write your code here
        long priceB = Math.min(bc, wc + z);
        long priceW = Math.min(wc, bc + z);
        return priceB * b + priceW * w;
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int b = scanner.nextInt();
            int w = scanner.nextInt();
            int bc = scanner.nextInt();
            int wc = scanner.nextInt();
            int z = scanner.nextInt();
            System.out.println(Result.taumBday(b, w, bc, wc, z));
        }
        scanner.close();
    }

//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int t = Integer.parseInt(bufferedReader.readLine().trim());
//
//        IntStream.range(0, t).forEach(tItr -> {
//            try {
//                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//                int b = Integer.parseInt(firstMultipleInput[0]);
//
//                int w = Integer.parseInt(firstMultipleInput[1]);
//
//                String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//                int bc = Integer.parseInt(secondMultipleInput[0]);
//
//                int wc = Integer.parseInt(secondMultipleInput[1]);
//
//                int z = Integer.parseInt(secondMultipleInput[2]);
//
//                long result = Result.taumBday(b, w, bc, wc, z);
//
//                bufferedWriter.write(String.valueOf(result));
//                bufferedWriter.newLine();
//
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        });
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
}

/*
Example Input
1
10 10
1 1 1
Example Output
20

Sample Test case 0 Input
5
10 10
1 1 1
5 9
2 3 4
3 6
9 1 1
7 7
4 2 1
3 3
1 9 2
Sample Test case 0 Output
20
37
12
35
12

Sample Test case 1 Input
1
3 5
3 4 1
Sample Test case 1 Output
29

 */