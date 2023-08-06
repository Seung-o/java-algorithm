package problem_6749;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int youngest = scanner.nextInt();
        int middle = scanner.nextInt();

        System.out.println(middle + (middle - youngest));
    }
}
