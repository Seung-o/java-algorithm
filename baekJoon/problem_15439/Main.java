package problem_15439;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = main.solution(n);
        System.out.println(result);
    }

    public int solution(int n) {
        return n * (n - 1);
    }
}
