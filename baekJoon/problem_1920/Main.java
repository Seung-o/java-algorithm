package problem_1920;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        HashMap<Long, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            long key = scanner.nextLong();
            hashMap.put(key, 1);
        }

        int M = scanner.nextInt();
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < M; i++) {
            answer.append(hashMap.getOrDefault(scanner.nextLong(), 0)).append("\n");
        }

        System.out.println(answer);
    }
}
