package problem_2884;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt(), minute = scanner.nextInt();
        if (minute < 45) {
            hour--;
            minute += 15;
        } else {
            minute -= 45;
        }
        
        if (hour < 0) {
            hour = 23;
        }
        System.out.println(hour + " " + minute);
    }
}
