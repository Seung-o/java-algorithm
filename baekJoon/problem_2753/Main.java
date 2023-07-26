package problem_2753;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int year = scanner.nextInt();
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
