package problem_15829;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String input = scanner.next();
        long answer = main.solution(N, input);
        System.out.println(answer);
    }

    public long solution(int N, String input) {
        long sum = 0;

        int r = 31;
        long M = 1234567891;

        long pow = 1;

        for (int i = 0; i < N; i++) {
            sum += (((long) input.charAt(i) - 96) * pow) % M;
            pow = (pow * 31) % M;
        }

        return sum % M;
    }
}
