package queue.problem_2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        String required = scanner.next();
        String input = scanner.next();
        String result = main.solution(required, input);
        System.out.println(result);
    }

    public String solution(String required, String input) {
        Queue<Character> requiredQueue = new LinkedList<>();
        Queue<Character> inputQueue = new LinkedList<>();

        for (char c : required.toCharArray()) {
            requiredQueue.add(c);
        }

        for (char c : input.toCharArray()) {
            inputQueue.add(c);
        }

        for (int i = 0; i < input.length(); i++) {
            char e = inputQueue.remove();

            if (e == requiredQueue.peek()) {
                requiredQueue.remove();
            }

            if (requiredQueue.isEmpty()) break;

        }
        return requiredQueue.size() == 0 ? "YES" : "NO";
    }
}
