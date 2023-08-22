package Array.problem_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for(int x : solution(N)) {
            System.out.print(x + " ");
        }
    }

    public static int[] solution(int N) {
        int[] result = new int[N];
        result[0] = 1;
        result[1] = 1;

        for(int i = 2; i < N; i++) {
            result[i] = result[i-1] + result[i-2];
        }

        return result;
    }
}
