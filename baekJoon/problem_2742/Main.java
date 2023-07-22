package problem_2742;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            for (int i = n; i > 0; i--) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
