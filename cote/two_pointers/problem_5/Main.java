package two_pointers.problem_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int result = main.solution(N);
        System.out.println(result);
    }

    public int solution(int N) {
        int[] arr = new int[N - 1];
        for (int i = 1; i < N - 1; i++) {
            arr[i] = i;
        }

        int sum = 0, count = 0, lt = 1;

        for (int rt = 1; rt < arr.length; rt++) {
            sum += arr[rt];

            if (sum == N) count++;


            while (sum >= N) {
                sum -= arr[lt++];
                if (sum == N) count++;
            }

        }

        return count;
    }
}
