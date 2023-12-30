package problem_1003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int[] memZero = new int[41], memOne = new int[41];
    public static int countZero = 0, countOne = 0;


    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        main.fibonacci(40);

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            answer.append(memZero[n]).append(" ").append(memOne[n]).append("\n");
        }
        System.out.println(answer);
    }

    public void fibonacci(int n) {
        memZero[0] = 1;
        memOne[0] = 0;

        for (int i = 1; i <= n; i++) {
            memZero[i] = memOne[i - 1];
            memOne[i] = memZero[i - 1] + memZero[i];
        }
    }
}
