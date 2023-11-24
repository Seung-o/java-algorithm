package problem_2231;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int answer = main.solution(N);
        System.out.println(answer);
    }

    public int solution(int N) {
        for (int i = 1; i <= 1000000; i++) {
            int temp = 0;
            String str = Integer.toString(i);
            for (int j = 0; j < str.length(); j++) temp += Character.getNumericValue(str.charAt(j));
            if (i + temp == N) return i;
        }

        return 0;
    }
}
