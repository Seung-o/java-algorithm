package two_pointers.problem_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] firstInput = new int[N];
        for (int i = 0; i < N; i++) {
            firstInput[i] = scanner.nextInt();
        }
        int M = scanner.nextInt();
        int[] secondInput = new int[M];
        for (int i = 0; i < M; i++) {
            secondInput[i] = scanner.nextInt();
        }
        ArrayList<Integer> result = main.solution(N, M, firstInput, secondInput);
        for (int x : result) {
            System.out.print(x + " ");
        }
    }

    public ArrayList<Integer> solution(int N, int M, int[] first, int[] second) {
        ArrayList<Integer> result = new ArrayList<>();

        int firstPointer = 0, secondPointer = 0;
        int lastFirstPointer = 0, lastSecondPointer = 0;
        int minLength = Math.min(N, M);

        while (firstPointer < N && secondPointer < M) {
            int firstValue = first[firstPointer];
            int secondValue = second[secondPointer];

            if (firstValue <= secondValue) {
                result.add(firstValue);
                lastFirstPointer = firstPointer;
                firstPointer++;
            } else {
                result.add(secondValue);
                lastSecondPointer = secondPointer;
                secondPointer++;
            }
        }

        if (lastFirstPointer < N - 1) {
            for (int i = firstPointer; i < N; i++) result.add(first[i]);
        }

        if (lastSecondPointer < M - 1) {
            for (int i = secondPointer; i < M; i++) result.add(second[i]);
        }


        return result;
    }
}
