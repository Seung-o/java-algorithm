package problem_2468;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static int N, count = 0, answer = 1;
    public static int[][] map, check;
    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};
    public static Set<Integer> set = new TreeSet<>();

    static int[][] deepCopy(int[][] arr) {
        int[][] result = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i].clone();
        }
        return result;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        map = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = scanner.nextInt();
                set.add(map[i][j]);
            }
        }

        main.solution();
        System.out.println(answer);
    }

    public void solution() {
        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()) {
            check = deepCopy(map);
            count = 0;
            int boundary = iterator.next();

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (check[i][j] > boundary) {
                        DFS(boundary, i, j);
                        count++;
                    }
                }
            }

            answer = Math.max(answer, count);
        }
    }

    public void DFS(int boundary, int x, int y) {
        if (check[x][y] <= boundary) return;

        check[x][y] = 0;
        for (int i = 0; i < 4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];

            if (newX >= 0 && newX < N && newY >= 0 && newY < N) {
                if (check[newX][newY] > boundary) {
                    DFS(boundary, newX, newY);
                }
            }

        }

    }
}
