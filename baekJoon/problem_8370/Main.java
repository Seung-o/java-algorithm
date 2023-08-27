package problem_8370;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt(), k1 = scanner.nextInt();
        int n2 = scanner.nextInt(), k2 = scanner.nextInt();
        int result = solution(n1, k1, n2, k2);
        System.out.println(result);
    }

    public static int solution(int n1, int k1, int n2, int k2) {
        return n1 * k1 + n2 * k2;
    }
}
