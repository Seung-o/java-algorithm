package Array.problem_5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int result = solution(N);
        System.out.println(result);
    }

    public static int solution(int N) {
        int[] arr = new int[N + 1];
        int count = 0;
        ArrayList<Integer> che = new ArrayList<>();


        for (int i = 2; i <= N; i++) {
            if (arr[i] != 0) continue;

            count++;
            for (int j = i; j <= N; j = j + i) {
                if (j % i == 0) arr[j] = 1;
            }
        }

        return count;
    }
}
