package problem_1654;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int K = Integer.parseInt(stringTokenizer.nextToken());
        long N = Integer.parseInt(stringTokenizer.nextToken());

        int[] input = new int[K];
        long max = Long.MIN_VALUE;
        long min = 1;
        for (int i = 0; i < K; i++) {
            input[i] = Integer.parseInt(bufferedReader.readLine());
            max = Math.max(max, input[i]);
        }

        max++;
        long mid = 0;

        while (min < max) {
            mid = (max + min) / 2;
            long count = 0;
            for (int j = 0; j < K; j++) {
                count += input[j] / mid;
            }

            if (count >= N) {
                min = mid + 1;
            } else {
                max = mid;
            }

        }


        System.out.println(min - 1);
    }
}
