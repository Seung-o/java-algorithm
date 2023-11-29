package problem_2609;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt(), n2 = scanner.nextInt();

        System.out.println(main.getGCD(n1, n2));
        System.out.println(main.getLCM(n1, n2));
    }

    public int getGCD(int n1, int n2) {
        int max = Math.max(n1, n2);

        for (int i = max; i >= 1; i--) {
            if (n1 % i == 0 && n2 % i == 0) return i;
        }

        return 1;
    }

    public long getLCM(int n1, int n2) {
        long i = 1;

        while (true) {
            if ((i * n1) % n2 == 0) return i * n1;
            i++;
        }
    }
}
