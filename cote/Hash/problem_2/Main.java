package Hash.problem_2;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        String first = scanner.next();
        String second = scanner.next();
        String result = main.solution(first, second);
        System.out.println(result);
    }

    public String solution(String first, String second) {
        String result = "YES";
        HashMap<Character, Integer> hashMap1 = convertToHashMap(first);
        HashMap<Character, Integer> hashMap2 = convertToHashMap(second);

        for (char x : hashMap1.keySet()) {
            int value1 = hashMap1.getOrDefault(x, 0);
            int value2 = hashMap2.getOrDefault(x, 0);
            if (value1 != value2) result = "NO";
        }

        return result;
    }

    public HashMap<Character, Integer> convertToHashMap(String input) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (char x : input.toCharArray()) {
            hashMap.put(x, hashMap.getOrDefault(x, 0) + 1);
        }

        return hashMap;
    }
}
