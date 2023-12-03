package problem_2751;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        StringBuilder stringBuilder = new StringBuilder();
        for (int x : arr) {
            stringBuilder.append(x).append("\n");
        }

        System.out.print(stringBuilder);
    }
}
