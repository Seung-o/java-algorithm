package problem_3052;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            int remainder = num % 42;
            hashMap.put(remainder, hashMap.getOrDefault(remainder, 0) + 1);
        }

        System.out.println(hashMap.size());
    }
}
