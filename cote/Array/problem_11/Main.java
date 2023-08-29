package Array.problem_11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    private static final int numOfGrades = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] students = new int[N][numOfGrades];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < numOfGrades; j++) {
                students[i][j] = scanner.nextInt();
            }
        }
        int result = solution(N, students);
        System.out.println(result);
    }

    public static int solution(int N, int[][] students) {
        int tempPresidentIdx = 0;
        int count = 0;

        for (int i = 0; i < N; i++) {

            HashSet<Integer> tempHashSet = new HashSet<>();
            for (int j = 0; j < numOfGrades; j++) {
                int me = students[i][j];
                int[] column = getColumnValues(students, j);
                for (int k = 0; k < column.length; k++) {
                    if (column[k] == me) tempHashSet.add(k);

                }
            }


            int total = tempHashSet.size();


            if (total > count) {
                count = total;
                tempPresidentIdx = i;
            }
        }

        return tempPresidentIdx + 1;
    }

    private static int countValuesInArray(int[] array, int target) {
        return (int) Arrays.stream(array)
                .filter(element -> element == target)
                .count() - 1;
    }

    private static int[] getColumnValues(int[][] array, int columnIndex) {
        return IntStream.range(0, array.length)
                .map(i -> array[i][columnIndex])
                .toArray();
    }
}
