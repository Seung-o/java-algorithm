package problem_10871;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            if (num < X) {
                arrayList.add(num);
            }
        }

        for (int num : arrayList) {
            System.out.print(num + " ");
        }
    }
}
