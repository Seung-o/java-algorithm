package dynamic_prorgramming.problem_2;

import java.util.Scanner;

public class Main {

    public static int[] dy;

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        dy = new int[N + 2];
        dy[1] = 2;
        dy[2] = 3;
        int answer = main.solution(N);
        System.out.println(answer);
    }

    public int solution(int L) {
        if (dy[L] != 0) return dy[L];

        if (L == 1 || L == 2) {
            return dy[L];
        } else {
            return dy[L] = solution(L - 1) + solution(L - 2);
        }
    }
}
