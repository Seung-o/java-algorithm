package problem_5522;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long sum = 0;

        for (int i = 0; i < 5; i++) {
            sum += scanner.nextInt();
        }
        System.out.println(sum);
    }
}
