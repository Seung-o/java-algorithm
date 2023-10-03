package problem_17219;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        HashMap<String, String> hashMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String site = scanner.next();
            String password = scanner.next();
            hashMap.put(site, password);
        }
        String[] targets = new String[M];
        for (int i = 0; i < M; i++) {
            targets[i] = scanner.next();
        }

        String[] answer = main.solution(hashMap, targets);
        for (String s : answer) System.out.println(s);
    }

    public String[] solution(HashMap<String, String> hashMap, String[] targets) {
        String[] answer = new String[targets.length];

        for (int i = 0; i < targets.length; i++) {
            answer[i] = hashMap.get(targets[i]);
        }

        return answer;
    }
}
