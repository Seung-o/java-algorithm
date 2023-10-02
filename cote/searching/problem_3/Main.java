package searching.problem_3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int C = scanner.nextInt();
        int[] input = new int[N];
        for (int i = 0; i < N; i++) {
            input[i] = scanner.nextInt();
        }
        int answer = main.solution(N, C, input);
        System.out.println(answer);
    }

    public int solution(int N, int C, int[] input) {
        int answer = 0;
        Arrays.sort(input);

        int lt = 1;
        int rt = Arrays.stream(input).max().getAsInt();

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            int capacity = countAvailableHorses(mid, input);

            if (capacity >= C) {
                answer = mid;
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }
        }


        return answer;
    }

    public int countAvailableHorses(int minDistance, int[] input) {
        int count = 1;

        int ep = input[0];

        for (int i = 1; i < input.length; i++) {
            if ((input[i] - ep) >= minDistance) {
                count++;
                ep = input[i];
            }
        }

        return count;
    }
}
