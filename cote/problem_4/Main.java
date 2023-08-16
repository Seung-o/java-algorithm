package problem_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String[] wordArr = new String[N];
        for(int i = 0; i < N; i++) {
            String word = scanner.next();
            wordArr[i] = word;
        }

        for(String word: wordArr) {
            System.out.println(solution2(word));
        }
    }

    private static String solution(String word) {
        String answer = "";
        char[] charArr = word.toCharArray();

        for(int i = charArr.length - 1; i >= 0; i--) {
            answer += charArr[i];
        }

        return answer;
    }

    private static String solution2(String word) {

        String answer = new StringBuilder(word).reverse().toString();

        return answer;
    }
}