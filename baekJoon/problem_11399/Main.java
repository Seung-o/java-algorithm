package problem_11399;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] P = new int[N];
        for (int i = 0; i < N; i++) {
            P[i] = scanner.nextInt();
        }

        int answer = main.solution(N, P);
        System.out.println(answer);
    }

    public int solution(int N, int[] P) {
        int answer = 0;
        int temp = 0;

        Arrays.sort(P);

        for (int i = 0; i < N; i++) {
            answer += temp + P[i];
            temp += P[i];
        }

        return answer;
    }
}
