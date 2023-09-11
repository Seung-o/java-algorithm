package Hash.problem_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] input = new int[N];
        for (int i = 0; i < N; i++) {
            input[i] = scanner.nextInt();
        }

        ArrayList<Integer> result = main.solution(N, K, input);
        for (int x : result) {
            System.out.print(x + " ");
        }
    }

    public ArrayList<Integer> solution(int N, int K, int[] input) {
        int lt = 0, rt = K - 1;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < K; i++) {
            hashMap.put(input[i], hashMap.getOrDefault(input[i], 0) + 1);
        }

        result.add(hashMap.size());

        while (rt < N - 1) {
            hashMap.put(input[lt], hashMap.getOrDefault(input[lt], 0) - 1);
            if (hashMap.get(input[lt]) <= 0) hashMap.remove(input[lt]);

            lt++;
            rt++;
            hashMap.put(input[rt], hashMap.getOrDefault(input[rt], 0) + 1);
            result.add(hashMap.size());
        }


        return result;
    }

}
