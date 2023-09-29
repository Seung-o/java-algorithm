package problem_11720;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String input = scanner.next();
        int answer = main.solution(N, input);
        System.out.println(answer);
    }

    public int solution(int N, String input) {
        int answer = 0;
        char[] arr = input.toCharArray();

        for (int i = 0; i < N; i++) {
            answer += Character.digit(arr[i], 10);
        }

        return answer;
    }
}
