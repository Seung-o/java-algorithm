package problem_11549;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int teaType = scanner.nextInt();
        int[] participantsAnswers = new int[5];
        for (int i = 0; i < 5; i++) {
            participantsAnswers[i] = scanner.nextInt();
        }
        int result = main.solution(teaType, participantsAnswers);
        System.out.println(result);
    }

    public int solution(int teaType, int[] participantsAnswers) {
        int result = 0;
        for (int i = 0; i < participantsAnswers.length; i++) {
            if (teaType == participantsAnswers[i]) result++;
        }
        return result;
    }
}
