package problem_2583;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Square {
    int x, y;

    public Square(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {

    public static int[][] map;
    public static int M, N;
    public static int sizeCount;

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        M = scanner.nextInt();
        N = scanner.nextInt();

        map = new int[N][M];

        int K = scanner.nextInt();

        Square[][] input = new Square[K][2];
        for (int i = 0; i < K; i++) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();

            for (int x = x1; x < x2; x++) {
                for (int y = y1; y < y2; y++) {
                    map[x][y] = 1;
                }
            }
        }

        ArrayList<Integer> answer = main.solution();
        System.out.println(answer.size());
        for (int x : answer) System.out.print(x + " ");

    }

    public ArrayList<Integer> solution() {

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] != 1) {
                    sizeCount = 0;
                    DFS(i, j);
                    arrayList.add(sizeCount);
                }
            }
        }

        Collections.sort(arrayList);

        return arrayList;
    }

    public void DFS(int x, int y) {

        if (x < 0 || x >= N || y < 0 || y >= M) {
            return;
        }

        if (map[x][y] == 1) {
        } else {
            map[x][y] = 1;
            sizeCount++;
            DFS(x + 1, y);
            DFS(x - 1, y);
            DFS(x, y + 1);
            DFS(x, y - 1);
        }
    }
}
