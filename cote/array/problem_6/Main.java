package array.problem_6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] inputArr = new int[N];
        for (int i = 0; i < N; i++) {
            inputArr[i] = scanner.nextInt();
        }
        ArrayList<Integer> result = solution(inputArr);
        Iterator iterator = result.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }

    public static ArrayList<Integer> solution(int[] input) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int x : input) {
            String reversedStr = new StringBuilder(String.valueOf(x)).reverse().toString();
            int reversed = Integer.parseInt(reversedStr);
            if (isPrime(reversed)) result.add(reversed);
        }

        return result;
    }

    private static boolean isPrime(int n) {
        if (n == 1) return false;

        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
