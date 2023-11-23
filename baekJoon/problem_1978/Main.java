package problem_1978;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] input = new int[N];
        for (int i = 0; i < N; i++) {
            input[i] = scanner.nextInt();
        }
        int answer = main.solution(input);
        System.out.println(answer);
    }

    public int solution(int[] input) {
        int count = 0;

        ArrayList<Integer> arrayList = getPrimes(Arrays.stream(input).max().getAsInt());

        for (int n : input) {
            if (arrayList.contains(n)) count++;
        }

        return count;
    }

    public ArrayList<Integer> getPrimes(int n) {
        int[] ch = new int[n + 1];
        ArrayList<Integer> result = new ArrayList<>();


        for (int i = 2; i <= n; i++) {
            if (ch[i] == 0) {
                result.add(i);
                for (int j = i; j <= n; j = j + i) {
                    ch[j] = 1;
                }
            }
        }

        return result;
    }
}
