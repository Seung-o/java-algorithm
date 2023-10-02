package array.problem_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        for (int i = 0; i < N; i++) {
            B[i] = scanner.nextInt();
        }

        for (String s : solution(A, B)) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> solution(int[] A, int[] B) {
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < A.length; i++) {
            if (A[i] == B[i]) {
                result.add("D");
            } else if ((A[i] == 1 && B[i] == 3) || (A[i] == 2 && B[i] == 1) || (A[i] == 3 && B[i] == 2)) {
                result.add("A");
            } else {
                result.add("B");
            }
        }

        return result;
    }
}
