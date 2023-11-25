package problem_2292;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int answer = main.solution(N);
        System.out.println(answer);
    }

    public int solution(int N) {

        if (N == 1) {
            return 1;
        }

        int n = 1;

        for (int i = 1; i < 1000000000; i += n) {
            if ((6 * i + 1) >= N) {
                return n + 1;
            }
            n++;
        }

        return 0;
    }
}
