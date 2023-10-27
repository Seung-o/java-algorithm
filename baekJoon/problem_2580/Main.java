package problem_2580;

import java.util.Scanner;

public class Main {

    public static int[][] board = new int[9][9];


    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = scanner.nextInt();
            }
        }
        main.DFS(0, 0);
    }


    public void DFS(int x, int y) {


        if (y == 9) {
            DFS(x + 1, 0);
            return;
        }

        if (x == 9) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
            System.exit(0);
        }

        if (board[x][y] == 0) {
            for (int i = 1; i <= 9; i++) {
                if (isPossible(x, y, i)) {
                    board[x][y] = i;
                    DFS(x, y + 1);
                }
            }
            board[x][y] = 0;
            return;
        }

        DFS(x, y + 1);
    }

    public boolean isPossible(int x, int y, int value) {
        for (int dx = 0; dx < 9; dx++) {
            if (board[dx][y] == value) return false;
        }

        for (int dy = 0; dy < 9; dy++) {
            if (board[x][dy] == value) return false;
        }


        int xL = (x / 3) * 3;
        int yL = (y / 3) * 3;

        for (int dx = xL; dx < xL + 3; dx++) {
            for (int dy = yL; dy < yL + 3; dy++) {
                if (board[dx][dy] == value) return false;
            }
        }

        return true;
    }
}
