package problem_9935;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String explode = scanner.next();
        String answer = main.solution(str, explode);
        System.out.println(answer);
    }

    public String solution(String str, String explode) {
        int explodeLength = explode.length();
        String peeked = "";

        for (int i = 0; i < str.length(); i++) {
            peeked += str.charAt(i);

            if (peeked.length() >= explodeLength && peeked.substring(peeked.length() - explodeLength).equals(explode)) {
                peeked = peeked.substring(0, peeked.length() - explodeLength);
            }

        }

        return peeked.length() == 0 ? "FRULA" : peeked;
    }
}
