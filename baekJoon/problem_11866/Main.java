package problem_11866;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        String answer = main.solution(N, K);
        System.out.println(answer);
    }

    public String solution(int N, int K) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<");
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) queue.offer(i);
        int count = 1;

        while (!queue.isEmpty()) {
            int cur = queue.poll();

            if (count == K) {
                if (queue.isEmpty()) {
                    stringBuilder.append(cur);
                } else {
                    stringBuilder.append(cur + ", ");
                }
                count = 1;
            } else {
                queue.offer(cur);
                count++;
            }
        }


        stringBuilder.append(">");
        return stringBuilder.toString();
    }
}
