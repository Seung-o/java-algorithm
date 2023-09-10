package problem_15700;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        long M = scanner.nextLong();
        System.out.println(main.solution(N, M));
    }

    public long solution(long N, long M) {
        long answer = 0;
        if (M <= 1 && N <= 1) answer = 0;
        else if (M <= 1) answer = N / 2;
        else if (N <= 1) answer = M / 2;
        else answer = N * (M / 2) + ((M % 2) * (N / 2));
        return answer;
    }
}
