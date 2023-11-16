package problem_10952;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            if (A == 0 && B == 0) {
                break;
            }
            System.out.println(A + B);
        }

        scanner.close();
    }
}
