package hackerrank.Practice.Algorithms.ch052_OrganizingContainersOfBalls;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'organizingContainers' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts 2D_INTEGER_ARRAY container as parameter.
     */

    public static String organizingContainers(List<List<Integer>> container) {
        // Write your code here
        int[] containersCapacity = new int[container.size()];
        int[] ballsColors = new int[container.size()];
        for (int i = 0; i < container.size(); i++) {
            containersCapacity[i] = container.get(i).stream().mapToInt(Integer::intValue).sum();
            for (int j = 0; j < container.get(i).size(); j++) {
                int color = container.get(i).get(j);
                ballsColors[j] += color;
            }
        }
        Arrays.sort(containersCapacity);
        Arrays.sort(ballsColors);
        String res = "Possible";
        for (int i = 0; i < containersCapacity.length; i++) {
            if (containersCapacity[i] != ballsColors[i]) { res = "Impossible"; break; }
        }
        return res;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<List<Integer>> container = new ArrayList<>();

                IntStream.range(0, n).forEach(i -> {
                    try {
                        container.add(
                                Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                        .map(Integer::parseInt)
                                        .collect(toList())
                        );
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                });

                String result = Result.organizingContainers(container);
                System.out.println(result);
//                bufferedWriter.write(result);
//                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
//        bufferedWriter.close();
    }
}


/*
Sample Input 0
2
2
1 1
1 1
2
0 2
1 1
Sample Output 0
Possible
Impossible

Sample Input 1
2
3
1 3 1
2 1 2
3 3 3
3
0 2 1
1 1 1
2 0 0
Sample Output 1
Impossible
Possible
 */