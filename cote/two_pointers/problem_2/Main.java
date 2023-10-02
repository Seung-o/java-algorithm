package two_pointers.problem_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr1 = new int[N];
        for (int i = 0; i < N; i++) {
            arr1[i] = scanner.nextInt();
        }

        int M = scanner.nextInt();
        int[] arr2 = new int[M];
        for (int i = 0; i < M; i++) {
            arr2[i] = scanner.nextInt();
        }

        ArrayList<Integer> result = main.solution(N, M, arr1, arr2);
        for (int x : result) {
            System.out.print(x + " ");
        }
    }

    public ArrayList<Integer> solution(int N, int M, int[] arr1, int[] arr2) {
        ArrayList<Integer> result = new ArrayList<>();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0, j = 0;

        while (i < N && j < M) {
            if (arr1[i] == arr2[j]) {
                result.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return result;
    }
}
