package problem_5568;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static int n, k;
    public static int[] cards, check, pm;

    public static HashMap<Integer, Integer> hashMap = new HashMap<>();

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        k = scanner.nextInt();
        cards = new int[n];
        check = new int[n];
        pm = new int[k];

        for (int i = 0; i < n; i++) cards[i] = scanner.nextInt();

        main.solution(0);
        System.out.println(hashMap.size());
    }

    public static int getIntFromSelectedCards() {

        String answer = "";

        for (int i = 0; i < k; i++) {
            answer += pm[i];
        }

        return Integer.parseInt(answer);
    }

    public void solution(int L) {


        if (L == k) {
            int cardNum = getIntFromSelectedCards();
            hashMap.put(cardNum, hashMap.getOrDefault(cardNum, 0) + 1);
        } else {
            for (int i = 0; i < n; i++) {
                if (check[i] == 0) {
                    pm[L] = cards[i];
                    check[i] = 1;
                    solution(L + 1);
                    check[i] = 0;
                }
            }
        }

    }
}
