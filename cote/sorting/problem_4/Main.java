package sorting.problem_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int S = scanner.nextInt();
        int N = scanner.nextInt();
        int[] input = new int[N];
        for (int i = 0; i < N; i++) {
            input[i] = scanner.nextInt();
        }
        int[] result = main.solution(S, N, input);
        for (int x : result) {
            System.out.print(x + " ");
        }

    }

    public int[] solution(int maxSize, int N, int[] tasks) {
        int[] memory = new int[maxSize];

        for (int i = 0; i < maxSize; i++) {
            memory[i] = 0;
        }

        for (int task : tasks) {

            int tmpIdx = -1;

            for (int i = 0; i < maxSize; i++) {
                if (memory[i] == task) {
                    tmpIdx = i;
                    break;
                }
            }

            if (tmpIdx == -1) {
                for (int i = maxSize - 1; i > 0; i--) {
                    memory[i] = memory[i - 1];
                }
                memory[0] = task;
            } else {
                for (int i = tmpIdx; i > 0; i--) {
                    memory[i] = memory[i - 1];
                }
                memory[0] = task;
            }

        }

        return memory;
    }
}
