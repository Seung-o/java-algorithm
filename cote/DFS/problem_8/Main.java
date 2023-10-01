package DFS.problem_8;

import java.util.Scanner;

public class Main {

    public static int N;
    public static int[][] map;
    public static int answer = 0;

    public static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    public static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        map = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = scanner.nextInt();
            }
        }
        main.solution();
        System.out.println(answer);

    }

    public void solution() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1) {
                    answer++;
                    DFS(i, j);
                }
            }
        }
    }

    public void DFS(int x, int y) {
        map[x][y] = 0;
        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < N && ny >= 0 && ny < N) {
                if (map[nx][ny] == 1) {
                    DFS(nx, ny);
                }
            }
        }
    }
}
