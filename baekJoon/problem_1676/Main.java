package problem_1676;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String str = (main.solution(N)).toString();

        int count = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != '0') {
                System.out.println(count);
                System.exit(0);
            }
            count++;
        }

    }

    public BigInteger solution(int n) {
        BigInteger result = BigInteger.valueOf(1);
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }
}
