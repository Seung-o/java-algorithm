package problem_2558;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLong()) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long result = a + b;

            System.out.println(result);
        }

        scanner.close();
    }
}
