package problem_2164;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        if (N == 1) {
            System.out.println(1);
            System.exit(0);
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        while (!queue.isEmpty()) {
            queue.poll();

            if (queue.size() == 1) break;

            queue.offer(queue.poll());
        }

        System.out.println(queue.poll());

    }
}
