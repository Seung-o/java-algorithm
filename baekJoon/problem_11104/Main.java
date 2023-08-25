package problem_11104;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] result = new int[N];
        for (int i = 0; i < N; i++) {
            result[i] = Integer.parseInt(scanner.next(), 2);
        }

        for (int i : result) {
            System.out.println(i);
        }
    }
}
