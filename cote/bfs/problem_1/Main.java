package bfs.problem_1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int S = scanner.nextInt();
        int E = scanner.nextInt();
        int answer = main.solution(S, E);
        System.out.println(answer);
    }

    public int solution(int S, int E) {

        int L = 0;
        int[] check = new int[10001];
        int[] dis = {1, -1, 5};

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(S);

        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                int cur = queue.poll();


                for (int d : dis) {
                    int child = cur + d;
                    if (child == E) return L + 1;
                    if (child >= 1 && child <= 10000 && check[child] == 0) {
                        check[child] = 1;
                        queue.offer(child);
                    }
                }
            }

            L++;
        }
        return 0;
    }
}
