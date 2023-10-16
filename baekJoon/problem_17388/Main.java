package problem_17388;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int min = Integer.MAX_VALUE;
        int minIdx = 0;


        for (int i = 0; i < 3; i++) {
            int cur = scanner.nextInt();
            sum += cur;
            if (min > cur) {
                min = cur;
                minIdx = i;
            }
        }


        if (sum >= 100) {
            System.out.println("OK");
        } else {
            if (minIdx == 0) {
                System.out.println("Soongsil");
            } else if (minIdx == 1) {
                System.out.println("Korea");
            } else {
                System.out.println("Hanyang");
            }
        }
    }
}
