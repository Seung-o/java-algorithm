package dynamic_prorgramming.problem_1;

import java.util.Scanner;

public class Main {

    public static int[] dy;

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        dy = new int[N + 1];
        dy[1] = 1;
        dy[2] = 2;

        int answer = main.solution(N);

        System.out.println(answer);
    }

    public int solution(int L) {
        if (L == 1 || L == 2) {
            return dy[L];
        } else {
            return dy[L] = solution(L - 1) + solution(L - 2);
        }
    }
}
