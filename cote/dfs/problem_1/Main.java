package dfs.problem_1;

import java.util.Scanner;

public class Main {
    public static int N;
    public static int[] input;
    public static int[] check;
    public static String answer = "NO";
    public static int total = 0;

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        check = new int[N];
        input = new int[N];
        for (int i = 0; i < N; i++) {
            input[i] = scanner.nextInt();
            total += input[i];
        }
        main.solution(0, input[0]);
        System.out.println(answer);
    }

    public void solution(int index, int sum) {

        if (answer == "YES") return;

        if (sum > total / 2) return;

        if (isCoprimeIntegers(sum)) {
            answer = "YES";
        } else {
            int newIndex = index + 1;

            if (newIndex >= N) return;

            solution(newIndex, sum + input[newIndex]);
            solution(newIndex, sum);
        }
    }

    public boolean isCoprimeIntegers(int sum) {
        return (total - sum) == sum;
    }
}
