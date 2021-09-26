package hackerrank.Tutorials.ThirtyDaysOfCode.Examples;
// public class Solution renamed to Day28
// Day 28: RegEx, Patterns, and Intro to Databases
//https://www.hackerrank.com/challenges/30-rege-patterns/problem

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class Day28 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        // regex pattern
        Pattern p = Pattern.compile("\\b[\\w.]+@gmail.com$");
        // list for gathering matched results
        List<String> list = new ArrayList<>();

        IntStream.range(0, N).forEach(NItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().trim().split(" ");
                String firstName = firstMultipleInput[0];
                String emailID = firstMultipleInput[1];
                // gathering matched results
                if (p.matcher(emailID).matches()) list.add(firstName);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        // sorting ArrayList
        list.sort(Comparator.naturalOrder());
        // printing result
        list.forEach(System.out::println);

        bufferedReader.close();
    }
}

/*
Sample Input

6
riya riya@gmail.com
julia julia@julia.me
julia sjulia@gmail.com
julia julia@gmail.com
samantha samantha@gmail.com
tanya tanya@gmail.com

Sample Output

julia
julia
riya
samantha
tanya


Input (stdin)
30
riya riya@gmail.com
julia julia@julia.me
julia sjulia@gmail.com
julia julia@gmail.com
samantha samantha@gmail.com
tanya tanya@gmail.com
riya ariya@gmail.com
julia bjulia@julia.me
julia csjulia@gmail.com
julia djulia@gmail.com
samantha esamantha@gmail.com
tanya ftanya@gmail.com
riya riya@live.com
julia julia@live.com
julia sjulia@live.com
julia julia@live.com
samantha samantha@live.com
tanya tanya@live.com
riya ariya@live.com
julia bjulia@live.com
julia csjulia@live.com
julia djulia@live.com
samantha esamantha@live.com
tanya ftanya@live.com
riya gmail@riya.com
priya priya@gmail.com
preeti preeti@gmail.com
alice alice@alicegmail.com
alice alice@gmail.com
alice gmail.alice@gmail.com

Expected Output
alice
alice
julia
julia
julia
julia
preeti
priya
riya
riya
samantha
samantha
tanya
tanya

 */