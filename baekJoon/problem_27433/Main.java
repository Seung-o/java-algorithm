package problem_27433;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        long result = 1;
        for(int i = 1 ; i <= n ; i++) {
            result = result * i;
        }

        System.out.println(result);
        scanner.close();
    }

}
