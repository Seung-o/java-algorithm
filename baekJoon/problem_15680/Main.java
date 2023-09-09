package problem_15680;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        main.solution(N);
    }

    public void solution(int N) {
        if (N == 0) System.out.println("YONSEI");
        else System.out.println("Leading the Way to the Future");
    }
}
