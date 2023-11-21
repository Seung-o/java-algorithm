package problem_4153;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            long A = scanner.nextInt();
            long B = scanner.nextInt();
            long C = scanner.nextInt();

            if (A == 0 && B == 0 && C == 0) break;

            System.out.println(main.solution(A, B, C));
        }
    }

    public String solution(long A, long B, long C) {
        
        if (A * A == B * B + C * C || B * B == A * A + C * C || C * C == A * A + B * B) return "right";

        return "wrong";
    }
}
