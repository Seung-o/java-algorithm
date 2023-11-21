package problem_10809;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int[] answer = new int[26];
        Arrays.fill(answer, -1);

        for (int i = 0; i < S.length(); i++) {
            int index = S.charAt(i) - 'a';
            if (answer[index] == -1) {
                answer[index] = i;
            }
        }

        for (int num : answer) {
            System.out.print(num + " ");
        }
    }
}
