package problem_15963;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong(), m = scanner.nextLong();
        System.out.println(n == m ? 1 : 0);
    }
}
