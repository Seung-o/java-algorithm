package Hash.problem_5;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] input = new int[N];
        for (int i = 0; i < N; i++) {
            input[i] = scanner.nextInt();
        }
        int result = main.solution(N, K, input);
        System.out.println(result);
    }

    public int solution(int N, int K, int[] input) {
        int result = -1;
        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    treeSet.add(input[i] + input[j] + input[k]);
                }
            }
        }

        if (K > treeSet.size()) return -1;

        int count = 0;
        for (int x : treeSet) {
            count++;
            if (K == count) {
                result = x;
                break;
            }
        }

        return result;
    }
}
