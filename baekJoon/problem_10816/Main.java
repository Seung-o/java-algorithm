package problem_10816;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }

        StringBuilder answer = new StringBuilder();
        int M = scanner.nextInt();
        for (int i = 0; i < M; i++) {
            int value = hashMap.getOrDefault(scanner.nextInt(), 0);
            answer.append(value).append(" ");
        }

        System.out.println(answer);
    }
}
