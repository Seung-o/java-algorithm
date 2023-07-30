package problem_4562;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] dataSet = new int[n][2];

        for (int i = 0; i < n; i++) {
            int NumberOfBrains = scanner.nextInt();
            int NumberOfBrainsEaten = scanner.nextInt();

            dataSet[i] = new int[]{NumberOfBrains, NumberOfBrainsEaten};
        }

        for (int i = 0; i < n; i++) {
            if (dataSet[i][0] >= dataSet[i][1]) {
                System.out.println("MMM BRAINS");
            } else {
                System.out.println("NO BRAINS");
            }
        }
    }
}
