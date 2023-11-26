package problem_1259;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();

            if (n == 0) break;

            String answer = main.solution(n);
            System.out.println(answer);
        }
    }

    public String solution(int n) {
        String str = Integer.toString(n);
        int lt = 0, rt = str.length() - 1;

        while (lt < rt) {
            if (str.charAt(lt) != str.charAt(rt)) return "no";
            lt++;
            rt--;
        }

        return "yes";
    }
}
