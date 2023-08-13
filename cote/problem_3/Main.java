package problem_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(solution(str));
    }

    public static String solution(String str) {
        String answer = "";
        String[] arr = str.split(" ");
        for(String s : arr) {
            if(s.length() > answer.length()) {
                answer = s;
            }
        }

        return answer;
    }
}
