package problem_19532;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int f = scanner.nextInt();
        main.solution(a, b, c, d, e, f);
    }

    public void solution(int a, int b, int c, int d, int e, int f) {

        if ((a * e - d * b) == 0) {
            System.out.println("0 0");
            return;
        }

        int x = (c * e - f * b) / (a * e - d * b);
        int y = b == 0 ? ((f - d * x) / e) : ((c - a * x) / b);

        System.out.println(x + " " + y);
    }
}
