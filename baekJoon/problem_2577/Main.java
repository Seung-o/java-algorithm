package problem_2577;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        String multiplied = Integer.toString(A * B * C);
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int j = 0; j < multiplied.length(); j++) {
            int key = Character.digit(multiplied.charAt(j), 10);
            hashMap.put(key, hashMap.getOrDefault(key, 0) + 1);
        }

        for (int i = 0; i <= 9; i++) {
            System.out.println(hashMap.getOrDefault(i, 0));
        }
    }
}
