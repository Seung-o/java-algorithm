package problem_2869;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long V = scanner.nextLong();

        long temp = V - A;

        if (temp % (A - B) == 0) {
            System.out.println(temp / (A - B) + 1);
        } else {
            System.out.println(temp / (A - B) + 2);
        }
    }
}
