package problem_6810;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int base = 9 + 7 * 3 + 8 + 9 + 2 * 3 + 1 + 4 * 3 + 1 + 8 * 3;
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        int result = base + n1 + n2 * 3 + n3;

        System.out.println("The 1-3-sum is " + result);
    }
}
