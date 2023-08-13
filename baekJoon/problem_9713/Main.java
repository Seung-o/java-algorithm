package problem_9713;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCaseCount = scanner.nextInt();

        for (int i = 0; i < testCaseCount; i++) {
            int N = scanner.nextInt();
            int sum = 0;
            for (int j = 1; j <= N; j++) {
                if (j % 2 == 1) {
                    sum += j;
                }
            }
            System.out.println(sum);
        }
    }
}
