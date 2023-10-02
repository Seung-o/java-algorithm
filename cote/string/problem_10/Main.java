package string.problem_10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char t = scanner.next().charAt(0);
        String result = solution(s, t);
        System.out.println(result);
    }

    public static String solution(String s, char t) {
        List<Integer> indexOfTarget = findIndexOfTarget(s, t);


        char[] charArr = s.toCharArray();
        String[] result = new String[charArr.length];

        for (int i = 0; i < charArr.length; i++) {
            int min = 100;
            Iterator<Integer> iterator = indexOfTarget.iterator();

            while (iterator.hasNext()) {
                int idx = iterator.next();
                min = Math.min(min, Math.abs(i - idx));
            }

            result[i] = String.valueOf(min);
        }

        return String.join(" ", result);
    }

    private static List<Integer> findIndexOfTarget(String s, char t) {
        int startIndex = 0;
        int len = s.length();
        List<Integer> result = new ArrayList();
        while (startIndex < len) {
            int idx = s.indexOf(t, startIndex);

            if (idx == -1) break;

            result.add(idx);
            startIndex = idx + 1;
        }

        return result;
    }
}
