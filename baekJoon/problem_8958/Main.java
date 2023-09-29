package problem_8958;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String[] input = new String[N];
        for (int i = 0; i < N; i++) input[i] = scanner.next();
        int[] answer = main.solution(N, input);
        for (int x : answer) System.out.println(x);
    }

    public int[] solution(int N, String[] input) {
        int[] answer = new int[N];

        for (int i = 0; i < N; i++) {
            String cur = input[i];
            int continuity = 0;

            for (char ch : cur.toCharArray()) {
                if (ch == 'O') {
                    answer[i] += (1 + continuity);
                    continuity++;
                } else continuity = 0;
            }
        }

        return answer;
    }
}
