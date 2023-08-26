package problem_11319;

import java.util.Scanner;

public class Main {
    public static int[][] solution(String[] input) {
        int[][] result = new int[input.length][2];
        for (int i = 0; i < input.length; i++) {
            char[] charArray = input[i].toLowerCase().toCharArray();
            int consonant = 0;
            int vowel = 0;

            for (char ch : charArray) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowel++;
                } else if (ch != ' ') {
                    consonant++;
                }
            }

            result[i][0] = consonant;
            result[i][1] = vowel;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        String[] input = new String[N];

        for (int i = 0; i < N; i++) {
            input[i] = scanner.nextLine();
        }

        int[][] result = solution(input);
        for (int[] x : result) {
            System.out.println(x[0] + " " + x[1]);
        }
    }
}
