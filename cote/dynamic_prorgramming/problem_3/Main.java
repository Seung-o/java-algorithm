package dynamic_prorgramming.problem_3;

import java.util.Scanner;

public class Main {

    public static int[] dy;

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] input = new int[N];
        dy = new int[N];
        for (int i = 0; i < N; i++) input[i] = scanner.nextInt();
        int answer = main.solution(N, input);
        System.out.println(answer);
    }

    public int solution(int N, int[] input) {
        dy[0] = 1;
        dy[1] = input[0] < input[1] ? 2 : 1;

        int answer = dy[1];

        for (int i = 2; i < N; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (input[j] < input[i]) {
                    dy[i] = Math.max(dy[j] + 1, dy[i]);
                }
            }
            if (dy[i] == 0) dy[i] = 1;
            answer = Math.max(dy[i], answer);
        }

        return answer;
    }
}
