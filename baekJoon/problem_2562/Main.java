package problem_2562;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[9];
        int max = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            if (array[i] > max) {
                max = array[i];
                index = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(index);
    }
}
