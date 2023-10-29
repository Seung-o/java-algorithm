package problem_20492;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextInt();
        long case1 = (N * 78) / 100;
        long case2 = (N * 80) / 100 + ((N * 20 * 78) / 10000);
        System.out.println(case1 + " " + case2);
    }
}
