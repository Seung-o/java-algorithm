package dynamic_prorgramming.problem_6;

import java.util.Arrays;
import java.util.Scanner;


class Problem implements Comparable<Problem> {
    int score;
    int time;

    public Problem(int score, int time) {
        this.score = score;
        this.time = time;
    }

    @Override
    public int compareTo(Problem o) {
        return time - o.time;
    }
}

public class Main {

    public static int[] dy;

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        dy = new int[M + 1];
        Problem[] problems = new Problem[N];
        for (int i = 0; i < N; i++) {
            problems[i] = new Problem(scanner.nextInt(), scanner.nextInt());
        }
        int answer = main.solution(N, M, problems);
        System.out.println(answer);
    }

    public int solution(int N, int M, Problem[] problems) {
        Arrays.sort(problems);

        int answer = 0;

        for (int i = 0; i < N; i++) {
            Problem curProblem = problems[i];

            for (int j = curProblem.time; j <= M; j++) {
                if (j - curProblem.time < curProblem.time) {
                    dy[j] = Math.max(dy[j], dy[j - curProblem.time] + curProblem.score);
                } else {
                    dy[j] = Math.max(dy[j], dy[j - 1]);
                }

                answer = Math.max(answer, dy[j]);
            }
        }

        return answer;
    }
}
