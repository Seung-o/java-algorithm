package hash.problem_1;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String input = scanner.next();
        char result = main.solution(input);
        System.out.println(result);
    }

    public char solution(String input) {
        char result = 'A';
        int max = 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (char ch : input.toCharArray()) {
            hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);
        }

        for (char key : hashMap.keySet()) {
            int value = hashMap.get(key);
            if (value > max) {
                max = value;
                result = key;
            }
        }


        return result;
    }
}
