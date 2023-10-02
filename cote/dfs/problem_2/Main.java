package dfs.problem_2;

import java.util.Scanner;

public class Main {

    public static int C;
    public static int N;

    public static int[] weights;
    public static int answer = 0;

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        C = scanner.nextInt();
        N = scanner.nextInt();
        weights = new int[N];
        for (int i = 0; i < N; i++) weights[i] = scanner.nextInt();
        main.solution(-1, 0);
        System.out.println(answer);
    }

    public void solution(int index, int sum) {
        if (sum > C) return;

        if (sum > answer) answer = sum;


        int newIndex = index + 1;

        if (newIndex < N) {
            if (sum + weights[newIndex] <= C) {
                solution(newIndex, sum + weights[newIndex]);
            }
            solution(newIndex, sum);
        }
    }
}
