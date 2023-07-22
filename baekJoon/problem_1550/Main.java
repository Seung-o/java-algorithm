package problem_1550;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String input = scanner.next();

            if (!input.matches("[0-9A-Fa-f]{1,6}")) {
                System.out.println("Invalid input");
                break;
            }

            int result = Integer.parseInt(input, 16);
            System.out.println(result);
        }

        scanner.close();
    }
}
