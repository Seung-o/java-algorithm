package problem_10250;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int H = scanner.nextInt();
            int W = scanner.nextInt();
            int N = scanner.nextInt();
            main.solution(H, W, N);
        }
    }

    public int solution(int H, int W, int N) {
        int floor = N % H;
        int room = N / H + 1;
        if (floor == 0) {
            floor = H;
            room = N / H;
        }
        System.out.println(floor * 100 + room);
        return floor * 100 + room;
    }
}
