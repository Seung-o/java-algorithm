package String.problem_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char t = scanner.next().charAt(0);
        System.out.println(solution(str, t));
    }

    public static int solution(String str, char t) {
        int answer = 0;

        str = str.toLowerCase();
        t = Character.toLowerCase(t);

        for (char x : str.toCharArray()) {
            if (x == t) answer++;
        }

        return answer;
    }
}
