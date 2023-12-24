package problem_2108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());
        int[] input = new int[N];
        double sum = 0;
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        for (int i = 0; i < N; i++) {
            input[i] = Integer.parseInt(bufferedReader.readLine());
            sum += input[i];
            treeMap.put(input[i], treeMap.getOrDefault(input[i], 0) + 1);
        }

        Arrays.sort(input);
        int mode = input[0];
        int sameCnt = 0;
        for (int key : treeMap.keySet()) {

            if (key == mode) {
                continue;
            }

            if (treeMap.get(mode) < treeMap.get(key)) {
                mode = key;
                sameCnt = 0;
            } else if (treeMap.get(mode) == treeMap.get(key)) {
                if (sameCnt == 0) {
                    mode = key;
                }
                sameCnt++;
            }
        }


        System.out.println(Math.round(sum / N));
        System.out.println(input[(N / 2)]);
        System.out.println(mode);
        System.out.println(input[N - 1] - input[0]);
    }

}
