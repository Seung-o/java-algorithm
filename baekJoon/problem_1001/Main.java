package problem_1001;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLong()) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            System.out.println(a-b);
        }

        scanner.close();
    }
}
