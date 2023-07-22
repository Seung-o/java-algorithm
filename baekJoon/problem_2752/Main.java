package problem_2752;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] list = new int[3];

        while (scanner.hasNextInt()) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < 3; i++) {
                list[i] = scanner.nextInt();
            }

            Arrays.sort(list);

            for (int i = 0; i < 3; i++) {
                result.append(list[i]).append(" ");
            }

            System.out.println(result);
        }

        scanner.close();
    }
}
