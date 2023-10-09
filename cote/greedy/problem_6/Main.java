package greedy.problem_6;

import java.util.Scanner;

public class Main {
    public static int[] unf;

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        unf = new int[N + 1];
        for (int i = 1; i < N + 1; i++) {
            unf[i] = i;
        }

        int M = scanner.nextInt();

        for (int i = 0; i < M; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            main.union(a, b);
        }

        int v1 = main.find(scanner.nextInt());
        int v2 = main.find(scanner.nextInt());

        if (v1 == v2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public void union(int a, int b) {
        int v1 = find(a);
        int v2 = find(b);
        if (v1 != v2) {
            unf[v1] = v2;
        }
    }

    public int find(int idx) {
        if (unf[idx] == idx) {
            return unf[idx];
        }

        return unf[idx] = find(unf[idx]);
    }
}
