package DFS.problem_3;

import java.util.Scanner;

public class Main {

    public static int N, M, answer;
    public static int[][] input;

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        input = new int[N][2];
        for (int i = 0; i < N; i++) {
            input[i][0] = scanner.nextInt();
            input[i][1] = scanner.nextInt();
        }
        main.solution(-1, 0, 0);
        System.out.println(answer);
    }

    public void solution(int index, int scoreSum, int timeSum) {

        if (timeSum > M) return;

        if (scoreSum > answer) answer = scoreSum;

        int newIndex = index + 1;

        if (newIndex >= N) {
        } else {
            solution(newIndex, scoreSum + input[newIndex][0], timeSum + input[newIndex][1]);
            solution(newIndex, scoreSum, timeSum);
        }
    }
}
