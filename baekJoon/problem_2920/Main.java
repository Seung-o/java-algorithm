package problem_2920;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int prev = scanner.nextInt(), next;
        String result = "";
        for (int i = 0; i < 7; i++) {
            next = scanner.nextInt();
            if (prev < next) {
                if (result.equals("descending")) {
                    result = "mixed";
                    break;
                }
                result = "ascending";
            } else {
                if (result.equals("ascending")) {
                    result = "mixed";
                    break;
                }
                result = "descending";
            }
            prev = next;
        }
        System.out.println(result);
    }
}
