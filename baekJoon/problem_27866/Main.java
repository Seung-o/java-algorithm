package problem_27866;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int i = scanner.nextInt();

        for (int j = 0; j < S.length(); j++) {
            if (j == i - 1) {
                System.out.print(S.charAt(j));
                break;
            }
        }

        scanner.close();
    }
}
