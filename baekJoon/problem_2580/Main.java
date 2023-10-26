package problem_2580;

import java.util.Scanner;

public class Main {

    public static int[][] board = new int[9][9];
    public static int[][] checkBoard = new int[9][9];
    public static int blankCount = 0;
    public static int[] move = {-1, 1};
    public static int[] check = new int[10];
    public static int xL = 0, xH = 0, yL = 0, yH = 0;

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = scanner.nextInt();
                if (board[i][j] == 0) blankCount++;
            }
        }
        main.solution();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void solution() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == 0) {
                    xL = i - (i % 3);
                    yL = j - (j % 3);
                    xH = xL + 3;
                    yH = yL + 3;
                    DFS(i, j);

                    for (int x = 0; x < 9; x++) {
                        for (int y = 0; y < 9; y++) {
                            System.out.print(checkBoard[x][y] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println("==================");
                    checkBoard = new int[9][9];
                }
            }

        }
    }

    public void DFS(int x, int y) {
        if (board[x][y] != 0) {
            check[board[x][y]] = 1;
        }

        for (int m : move) {
            int dx = x + m;
            int dy = y + m;

//            if (dx == xL && checkBoard[dx][y] == 0) {
//                checkBoard[dx][y] = 1;
//                DFS(dx, y);
//            }
//
//            if (dy == yL && checkBoard[x][dy] == 0) {
//                checkBoard[x][dy] = 1;
//                DFS(x, dy);
//            }

            if (dx >= xL && dx < xH && checkBoard[dx][y] == 0) {
                checkBoard[dx][y] = 1;
                DFS(dx, y);
            }

            if (dy >= yL && dy < yH && checkBoard[x][dy] == 0) {
                checkBoard[x][dy] = 1;
                DFS(x, dy);
            }
        }
    }
}
