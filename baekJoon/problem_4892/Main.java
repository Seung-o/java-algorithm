package problem_4892;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;

        while (scanner.hasNextInt()) {
            int n0 = scanner.nextInt();
            if (n0 == 0) {
                break;
            }
            int n1 = 3 * n0;
            int n2 = n1 % 2 == 0 ? n1 / 2 : (n1 + 1) / 2;
            int n3 = 3 * n2;
            int n4 = n3 / 9;

            String oddOrEven = n1 % 2 == 0 ? "even" : "odd";

            System.out.println(count + ". " + oddOrEven + " " + n4);
            count++;
        }

    }
}