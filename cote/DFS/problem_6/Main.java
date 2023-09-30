package DFS.problem_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int N, F;
    public static boolean flag = false;
    public static Integer[] pm, check, input;

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        F = scanner.nextInt();
        pm = new Integer[N];
        check = new Integer[N];
        input = new Integer[N];
        for (int i = 0; i < N; i++) input[i] = i + 1;
        main.solution(0);
        for (int x : pm) System.out.print(x + " ");
    }

    public void solution(int L) {


        if (L == N) {
            if (this.calcSum(pm) == F) flag = true;

        } else {
            for (int i = 0; i < N; i++) {
                if (flag) return;

                if (check[i] == null) {
                    pm[L] = input[i];
                    check[i] = 1;
                    solution(L + 1);
                    check[i] = null;
                }
            }

        }
    }

    public int calcSum(Integer[] arr) {
        ArrayList<Integer> result = new ArrayList<>(Arrays.asList(arr));

        while (result.size() > 1) {
            ArrayList<Integer> arrayList = new ArrayList<>();

            for (int i = 0; i < result.size() - 1; i++) {
                arrayList.add(result.get(i) + result.get(i + 1));
            }

            result = arrayList;
        }


        return result.get(0);
    }
}
