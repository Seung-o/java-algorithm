package problem_2675;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        String[] answer = new String[T];
        for (int i = 0; i < T; i++) {
            int R = scanner.nextInt();
            String S = scanner.next();
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < S.length(); j++) {
                for (int k = 0; k < R; k++) {
                    stringBuilder.append(S.charAt(j));
                }
            }
            answer[i] = stringBuilder.toString();
        }

        for (String x : answer) System.out.println(x);
    }
}
