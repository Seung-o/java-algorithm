package problem_1456;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        double[] scores = new double[N];
        double sum = 0;
        double max = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            scores[i] = scanner.nextDouble();
            max = Math.max(max, scores[i]);
        }

        for (int i = 0; i < N; i++) {
            sum += (scores[i] / max) * 100;
        }

        double answer = sum / N;
        System.out.println(answer);

    }
}
