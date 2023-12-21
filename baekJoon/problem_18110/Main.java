package problem_18110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());


        int[] opinions = new int[n];

        for (int i = 0; i < n; i++) opinions[i] = Integer.parseInt(br.readLine());

        Arrays.sort(opinions);

        int trimmed = (int) (Math.round(n * 0.15));

        int sum = 0;
        for (int i = trimmed; i < n - trimmed; i++) sum += opinions[i];
        int answer = Math.round((float) sum / (n - 2 * trimmed));
        System.out.println(answer);
    }
}
