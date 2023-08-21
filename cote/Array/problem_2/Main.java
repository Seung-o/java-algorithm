package Array.problem_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] students = new int[N];
        for(int i = 0; i < N; i++) {
            students[i] = scanner.nextInt();
        }
        int result = solution(students);
        System.out.println(result);
    }

    public static int solution(int[] students) {
        int max = 0;
        int count = 0;

        for(int i = 0; i < students.length; i++) {
            if(students[i] > max) {
                max = students[i];
                count++;
            }
        }

        return count;
    }
}
