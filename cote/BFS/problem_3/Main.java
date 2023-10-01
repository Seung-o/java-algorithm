package BFS.problem_3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Tomato {
    public int x, y, L;

    public Tomato(int x, int y, int L) {
        this.x = x;
        this.y = y;
        this.L = L;
    }
}

public class Main {

    public static int M, N;
    public static int[][] box;

    public static int[] dx = {1, -1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        M = scanner.nextInt();
        N = scanner.nextInt();
        box = new int[N][M];
        int total = 0;
        Queue<Tomato> queue = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                box[i][j] = scanner.nextInt();
                if (box[i][j] == 0) total++;
                if (box[i][j] == 1) queue.offer(new Tomato(i, j, 0));
            }
        }
        int answer = main.solution(total, queue);
        System.out.println(answer);

    }

    public int solution(int total, Queue<Tomato> queue) {
        int answer = 0;

        while (!queue.isEmpty()) {

            if (total == 0) break;

            Tomato cur = queue.poll();


            for (int i = 0; i < 4; i++) {
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];
                int nL = cur.L + 1;

                if (nx >= 0 && ny >= 0 && nx < N && ny < M && box[nx][ny] == 0) {
                    total--;
                    box[nx][ny] = 1;
                    queue.offer(new Tomato(nx, ny, nL));
                    answer = nL;
                }

            }

        }

        return total == 0 ? answer : -1;
    }
}
