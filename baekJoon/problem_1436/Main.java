package problem_1436;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        long title = 666;
        int count = 1;

        while (true) {
            if (count == N) {
                System.out.println(title);
                System.exit(0);
            }

            title++;
            if (main.hasTriple6(Long.toString(title))) {
                count++;
            }
        }
    }

    public boolean hasTriple6(String str) {
        String replaced = str.replace("666", "");
        return str.length() - replaced.length() >= 3;
    }
}
