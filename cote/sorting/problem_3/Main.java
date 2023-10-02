package sorting.problem_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] input = new int[N];
        for (int i = 0; i < N; i++) {
            input[i] = scanner.nextInt();
        }
        int[] result = main.solution(N, input);
        for (int x : result) {
            System.out.print(x + " ");
        }
    }

    public int[] solution(int N, int[] input) {
        for (int i = 1; i < N; i++) {

            int targetToInsert = input[i];
            int idxToInsert = i;

            for (int j = i - 1; j >= 0; j--) {
                if (input[j] > targetToInsert) {
                    input[j + 1] = input[j];
                    idxToInsert = j;
                } else {
                    break;
                }
            }

            input[idxToInsert] = targetToInsert;
        }

        return input;
    }
}
