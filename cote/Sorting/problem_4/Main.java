package Sorting.problem_4;

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

        for (int i = 0; i < N; i++) {

            int task = tasks[i];
            int tmpIdx = -1;


            for (int j = 0; j < maxSize; j++) {
                if (memory[j] == task) {
                    tmpIdx = j;
                    break;
                }
            }

            int[] newArr = new int[maxSize];
            newArr[0] = task;

            if (tmpIdx == -1) {
                System.arraycopy(memory, 0, newArr, 1, maxSize - 1);
            } else {
                int newIdx = 1;
                for (int k = 0; k < maxSize; k++) {
                    if (k != tmpIdx) {
                        newArr[newIdx++] = memory[k];
                    }
                }
            }

            memory = newArr;
        }

        return memory;
    }
}
