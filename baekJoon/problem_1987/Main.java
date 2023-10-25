package problem_1987;

import java.util.Scanner;

public class Main {

    public static int R, C;
    public static char[][] board;
    public static int[] check = new int[26];
    public static int[] dis = {-1, 1};
    public static int answer = 1;

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        R = scanner.nextInt();
        C = scanner.nextInt();
        board = new char[R][C];
        for (int i = 0; i < R; i++) {
            String str = scanner.next();
            for (int j = 0; j < C; j++) {
                board[i][j] = str.charAt(j);
            }
        }
        main.checkBoard(0, 0);
        main.solution(0, 0, 1);
        System.out.println(answer);
    }

    public void solution(int x, int y, int distance) {


        answer = Math.max(answer, distance);


        for (int d : dis) {

            int newX = x + d;
            int newY = y + d;

            if (newX >= 0 && newX < R && !isDuplicated(newX, y)) {
                checkBoard(newX, y);
                solution(newX, y, distance + 1);
                uncheckBoard(newX, y);
            }

            if (newY >= 0 && newY < C && !isDuplicated(x, newY)) {
                checkBoard(x, newY);
                solution(x, newY, distance + 1);
                uncheckBoard(x, newY);
            }
        }

    }

    public boolean isDuplicated(int x, int y) {
        return check[board[x][y] - 65] == 1;
    }

    public void checkBoard(int x, int y) {
        check[board[x][y] - 65] = 1;
    }

    public void uncheckBoard(int x, int y) {
        check[board[x][y] - 65] = 0;
    }
}
