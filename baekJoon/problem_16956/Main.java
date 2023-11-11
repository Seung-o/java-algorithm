package problem_16956;

import java.util.Scanner;

public class Main {

    public static int R, C;
    public static char[][] map;

    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        R = scanner.nextInt();
        C = scanner.nextInt();
        map = new char[R][C];
        for (int i = 0; i < R; i++) {
            String str = scanner.next();
            for (int j = 0; j < C; j++) {
                if (str.charAt(j) == '.') {
                    map[i][j] = 'D';
                } else {
                    map[i][j] = str.charAt(j);
                }
            }
        }

        main.solution();
    }

    public void solution() {
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (map[i][j] == 'W') {
                    check(i, j);
                }
            }
        }

        System.out.println(1);
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }

    public void check(int i, int j) {

        for (int k = 0; k < 4; k++) {
            int x = i + dx[k];
            int y = j + dy[k];

            if (x >= 0 && x < R && y >= 0 && y < C) {
                if (map[x][y] == 'S') {
                    System.out.println(0);
                    System.exit(0);
                }
            }
        }
    }
}
