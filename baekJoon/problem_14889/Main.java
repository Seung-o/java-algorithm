package problem_14889;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static int N, maxTeamCnt, total = 0, temp = 0;

    public static int[] check;
    public static int[][] S;


    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        maxTeamCnt = N / 2;
        check = new int[N + 1];
        S = new int[N + 1][N + 1];
        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < N + 1; j++) {
                S[i][j] = scanner.nextInt();
                total += S[i][j];
            }
        }
        

        main.DFS(1);
    }

    public void DFS(int idx) {

        if (countChecked() == maxTeamCnt) {
            temp = 0;
            ArrayList<Integer> arrayList = getCheckedIdxArr();
            int[] output = new int[2];
            boolean[] visited = new boolean[arrayList.size()];
            perm(arrayList, output, visited, 0);

        } else {
            if (idx < check.length) {
                check[idx] = 1;
                DFS(idx + 1);
                check[idx] = 0;
                DFS(idx + 1);
            }
        }
    }

    public void perm(ArrayList<Integer> arr, int[] output, boolean[] visited, int L) {
        if (L == 2) {
            temp += S[output[0]][output[1]];
            return;
        }

        for (int i = 0; i < arr.size(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                output[L] = arr.get(i);
                perm(arr, output, visited, L + 1);
                visited[i] = false;
            }
        }
    }

    public ArrayList<Integer> getCheckedIdxArr() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i < check.length; i++) {
            if (check[i] == 1) arrayList.add(i);
        }

        return arrayList;
    }

    public int countChecked() {
        int cnt = 0;
        for (int i = 1; i < check.length; i++) {
            if (check[i] == 1) cnt++;
        }

        return cnt;
    }
}
