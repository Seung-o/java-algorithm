package queue.problem_1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int result = main.solution(N, K);
        System.out.println(result);
    }

    public int solution(int N, int K) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            queue.add(i);
        }

        int count = 0;

        while (queue.size() > 1) {
            count++;
            if (count == K) {
                queue.remove();
                count = 0;
            } else queue.add(queue.remove());
        }

        return queue.peek() + 1;
    }
}
