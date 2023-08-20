package String.problem_12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String input = scanner.next();
        String result = solution(num, input);
        System.out.println(result);
    }

    public static String solution(int num, String input) {

        String answer = "";

        input = input.replace("#", "1");
        input = input.replace("*", "0");

        for (int i = 0; i < num; i++) {
            String sub = input.substring(i * 7, (i + 1) * 7);
            int decimal = binaryToDecimal(sub);
            answer += (char) decimal;
        }

        return answer;
    }

    private static int binaryToDecimal(String binary) {
        char[] charArr = binary.toCharArray();
        int result = 0;

        for (int i = 0; i < charArr.length; i++) {
            result += Character.getNumericValue(charArr[i]) * Math.pow(2, charArr.length - 1 - i);
        }

        return result;
    }
}
