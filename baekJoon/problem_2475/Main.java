package problem_2475;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int n = scanner.nextInt();
            sum += n * n;
        }
        System.out.println(sum % 10);
    }
}
