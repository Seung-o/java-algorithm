package problem_9019;

import java.util.Scanner;

public class Main {

    static int T;
    static int[][] testCases;

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt();
        testCases = new int[T][2];
        for (int i = 0; i < T; i++) {
            testCases[i][0] = scanner.nextInt();
            testCases[i][1] = scanner.nextInt();
        }


    }

    public int execD(int n) {
        return (n * 2) / 10000;
    }

    public int execS(int n) {
        if (n == 0) return 9999;
        return n - 1;
    }

    public int execL(int n) {
        if (n < 1000) return n * 10;
        return (n % 1000) * 10 + (n / 1000);
    }

    public int execR(int n) {
        return (n % 10) * 1000 + (n / 10);
    }
}
