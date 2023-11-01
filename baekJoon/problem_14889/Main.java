package problem_14889;

import java.util.Scanner;

public class Main {

    public static int N, maxTeamCnt, total = 0;

    public static int[] check;
    public static int[][] S;


    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        maxTeamCnt = N / 2;
        check = new int[N + 1];
        S = new int[N + 1][N + 1];
        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < N + 1; j++) {
                S[i][j] = scanner.nextInt();
                total += S[i][j];
            }
        }

        System.out.println(total);

        main.DFS(1);
    }

    public void DFS(int idx) {

        if (countChecked() == maxTeamCnt) {
            for (int i = 1; i < check.length; i++) System.out.print(check[i] + " ");
            System.out.println();
        } else {
            if (idx < check.length) {
                check[idx] = 1;
                DFS(idx + 1);
                check[idx] = 0;
                DFS(idx + 1);
            }
        }
    }

 
    public int countChecked() {
        int cnt = 0;
        for (int i = 1; i < check.length; i++) {
            if (check[i] == 1) cnt++;
        }

        return cnt;
    }
}
