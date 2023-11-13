package problem_1157;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next().toUpperCase();
        char answer = main.solution(input);
        System.out.println(answer);
    }

    public char solution(String input) {
        char answer = 0;
        boolean flag = false;
        int maxCount = Integer.MIN_VALUE;
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char key = input.charAt(i);
            hashMap.put(key, hashMap.getOrDefault(key, 0) + 1);
        }

        for (char key : hashMap.keySet()) {
            int value = hashMap.get(key);

            if (maxCount <= value) {
                answer = key;
                flag = maxCount == value;
                maxCount = value;
            }
        }

        return flag ? '?' : answer;

    }
}
