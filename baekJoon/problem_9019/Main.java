package problem_9019;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static int T;
    static int[][] testCases;

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt();
        testCases = new int[T][2];
        for (int i = 0; i < T; i++) {
            testCases[i][0] = scanner.nextInt();
            testCases[i][1] = scanner.nextInt();
            String answer = main.solution(testCases[i]);
            System.out.println(answer);
        }


    }

    public String solution(int[] testCase) {
        int[] visited = new int[10000];
        String[] command = new String[10000];

        int origin = testCase[0];
        int target = testCase[1];

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(origin);
        visited[origin] = 1;
        command[origin] = "";

        while (!queue.isEmpty()) {
            int n = queue.poll();

            int D = execD(n);
            int S = execS(n);
            int L = execL(n);
            int R = execR(n);

            if (visited[D] == 0) {
                visited[D] = 1;
                command[D] = command[n] + "D";
                queue.offer(D);
            }

            if (visited[S] == 0) {
                visited[S] = 1;
                command[S] = command[n] + "S";
                queue.offer(S);
            }

            if (visited[L] == 0) {
                visited[L] = 1;
                command[L] = command[n] + "L";
                queue.offer(L);
            }

            if (visited[R] == 0) {
                visited[R] = 1;
                command[R] = command[n] + "R";
                queue.offer(R);
            }

            if (visited[target] == 1) break;
        }

        return command[target];
    }


    public int execD(int n) {
        return (n * 2) % 10000;
    }

    public int execS(int n) {
        if (n == 0) return 9999;
        return n - 1;
    }

    public int execL(int n) {
        if (n < 1000) return n * 10;
        return (n % 1000) * 10 + (n / 1000);
    }

    public int execR(int n) {
        return (n % 10) * 1000 + (n / 10);
    }
}
