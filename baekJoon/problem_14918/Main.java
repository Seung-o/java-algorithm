package problem_14918;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int result = main.solution(x, y);
        System.out.println(result);
    }

    public int solution(int x, int y) {
        return x + y;
    }
}
