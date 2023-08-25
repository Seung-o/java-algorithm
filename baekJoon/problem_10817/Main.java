package problem_10817;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = new int[3];
        for (int i = 0; i < 3; i++) {
            input[i] = scanner.nextInt();
        }
        Arrays.sort(input);
        System.out.println(input[1]);
    }
}
