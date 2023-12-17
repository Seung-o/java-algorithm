package problem_2839;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int answer = main.solution(N);
        System.out.println(answer);
    }

    public int solution(int n) {
        int numberOf5kg = n / 5;
        for (int i = numberOf5kg; i >= 0; i--) {
            int remained = n - (i * 5);
            if (remained % 3 == 0) {
                return i + (remained / 3);
            }
        }

        return -1;
    }
}
