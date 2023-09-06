package TwoPointers.problem_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int k = scanner.nextInt();
        int[] input = new int[N];
        for (int i = 0; i < N; i++) {
            input[i] = scanner.nextInt();
        }
        int result = main.solution(N, k, input);
        System.out.println(result);
    }

    public int solution(int N, int k, int[] input) {
        int maxLength = 0, lt = 0, changeCountFrom0To1 = 0;

        for (int rt = 0; rt < N; rt++) {
            int length = rt - lt + 1;

            if (input[rt] == 0) changeCountFrom0To1++;

            if (changeCountFrom0To1 == k && length > maxLength) maxLength = length;

            while (changeCountFrom0To1 > k) {
                if (input[lt++] == 0) changeCountFrom0To1--;
            }
        }
        return maxLength;
    }
}
