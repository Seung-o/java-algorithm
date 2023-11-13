package problem_1152;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String trimmed = input.trim();

        if (trimmed.equals("")) System.out.println(0);
        else System.out.println(trimmed.split(" ").length);
    }
}
