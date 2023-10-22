package problem_2667;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    static int N;
    static int[][] map;

    static ArrayList<Integer> countList = new ArrayList<>();

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        map = new int[N][N];
        for (int i = 0; i < N; i++) {
            String line = scanner.next();
            for (int j = 0; j < N; j++) {
                map[i][j] = Character.getNumericValue(line.charAt(j));
            }
        }

        main.solution();
        System.out.println(countList.size());
        for (int x : countList) {
            System.out.println(x);
        }
    }

    public void solution() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1) {
                    countList.add(0);
                    DFS(countList.size() - 1, i, j);
                }
            }
        }
        countList.sort(Comparator.comparingInt(x -> x));
    }

    public void DFS(int index, int x, int y) {
        if (x >= 0 && y >= 0 && x < N && y < N && map[x][y] == 1) {
            countList.set(index, countList.get(index) + 1);
            map[x][y] = 0;
            DFS(index, x - 1, y);
            DFS(index, x + 1, y);
            DFS(index, x, y - 1);
            DFS(index, x, y + 1);
        }
    }
}
