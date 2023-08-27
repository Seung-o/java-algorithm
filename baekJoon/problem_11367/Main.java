package problem_11367;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[][] input = new String[n][2];
        for (int i = 0; i < n; i++) {
            input[i][0] = scanner.next();
            input[i][1] = scanner.next();
        }
        String[][] result = solution(n, input);
        for (String[] x : result) {
            System.out.println(x[0] + " " + x[1]);
        }
    }

    public static String[][] solution(int n, String[][] input) {
        String[][] result = new String[n][2];

        for (int i = 0; i < n; i++) {
            result[i][0] = input[i][0];
            result[i][1] = getLetterGrade(Integer.parseInt(input[i][1]));
        }

        return result;
    }

    private static String getLetterGrade(int score) {
        if (score >= 97) {
            return "A+";
        } else if (score >= 90) {
            return "A";
        } else if (score >= 87) {
            return "B+";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 77) {
            return "C+";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 67) {
            return "D+";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
