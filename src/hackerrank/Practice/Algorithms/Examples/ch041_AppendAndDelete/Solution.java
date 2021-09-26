package hackerrank.Practice.Algorithms.ch041_AppendAndDelete;

import java.io.*;

class Result {

    /*
     * Complete the 'appendAndDelete' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. STRING t
     *  3. INTEGER k
     */

    public static String appendAndDelete(String s, String t, int k) {
        // Write your code here

        // we can delete the whole string and append another
        if (s.length() + t.length() <= k) return "Yes";
        int i = 0; // index of the first non-matching character
        // while strings' length less than index and characters are equal...
        while (i < s.length() && i < t.length() && s.charAt(i) == t.charAt(i)) i++;
        int actions = (s.length() - i) + (t.length() - i); // minimum actions
        // we can add and remove char, so extra actions could be removes (even number)
        String res = (k >= actions && (k - actions) % 2 == 0)? "Yes" : "No";
        return res;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String t = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.appendAndDelete(s, t, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}


/*
Sample Input 0
hackerhappy
hackerrank
9
Sample Output 0
Yes

Sample Input 1
aba
aba
7
Sample Output 1
Yes

Sample Input 2
ashley
ash
2
Sample Output 2
No

 */