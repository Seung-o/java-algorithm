package DFS.problem_7;

import java.util.Scanner;

public class Main {


    public static int mazeSize = 8;
    public static int answer = 0;
    public static int goalForX = 7;
    public static int goalForY = 7;
    public static int[][] maze = new int[mazeSize][mazeSize];
    public static int[][] check = new int[mazeSize][mazeSize];
    public int[] dxArr = {-1, 1};
    public int[] dyArr = {-1, 1};

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i < mazeSize; i++) {
            for (int j = 1; j < mazeSize; j++) {
                maze[i][j] = scanner.nextInt();
            }
        }
        check[1][1] = 1;
        main.solution(1, 1);
        System.out.println(answer);

    }

    public void solution(int x, int y) {

        if (x == goalForX && y == goalForY) {
            answer++;
        } else if (maze[x][y] == 1) {
        } else {
            for (int dx : dxArr) {
                int targetX = x + dx;
                if (targetX == 0 || targetX >= mazeSize || targetX == 0 || targetX >= mazeSize) continue;

                if (check[targetX][y] == 0) {
                    check[targetX][y] = 1;
                    solution(targetX, y);
                    check[targetX][y] = 0;
                }
            }

            for (int dy : dyArr) {
                int targetY = y + dy;

                if (targetY == 0 || targetY >= mazeSize || targetY == 0 || targetY >= mazeSize) continue;

                if (check[x][targetY] == 0) {
                    check[x][targetY] = 1;
                    solution(x, targetY);
                    check[x][targetY] = 0;
                }
            }
        }
    }
}
