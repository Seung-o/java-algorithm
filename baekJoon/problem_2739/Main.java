package problem_2739;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= 9; i++) {
            stringBuilder.append(N).append(" * ").append(i).append(" = ").append(N * i);
            System.out.println(stringBuilder);
            stringBuilder.setLength(0);
        }
    }
}
