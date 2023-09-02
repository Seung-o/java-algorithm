package problem_13752;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] inputs = new int[n];
        for (int i = 0; i < n; i++) {
            inputs[i] = scanner.nextInt();
        }
        main.solution(inputs);

    }

    public void solution(int[] inputs) {
        for (int i = 0; i < inputs.length; i++) {
            for (int j = 0; j < inputs[i]; j++) {
                System.out.print("=");
            }
            System.out.println();
        }
    }
}
