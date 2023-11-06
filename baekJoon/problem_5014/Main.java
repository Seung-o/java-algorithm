package problem_5014;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        int F = scanner.nextInt();
        int S = scanner.nextInt();
        int G = scanner.nextInt();
        int U = scanner.nextInt();
        int D = scanner.nextInt();

        int answer = main.solution(F, S, G, U, D);
        if (answer == -1) System.out.println("use the stairs");
        else System.out.println(answer);

    }

    public int solution(int F, int S, int G, int U, int D) {

        int answer = 0, L = 0;

        if (S == G) return answer;

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(S);

        int[] check = new int[F + 1];
        check[S] = 1;

        while (!queue.isEmpty()) {

            int len = queue.size();

            for (int i = 0; i < len; i++) {
                int cur = queue.poll();

                if (cur < 0 || cur > F) continue;

                if (cur == G) {
                    answer = L;
                    return answer;
                } else {
                    int up = cur + U;
                    if (cur != up && up <= F && check[up] == 0) {
                        check[up] = 1;
                        queue.offer(up);
                    }

                    int down = cur - D;
                    if (cur != down && down > 0 && check[down] == 0) {
                        check[cur - D] = 1;
                        queue.offer(cur - D);
                    }
                }
            }

            L++;
        }

        return -1;
    }
}
