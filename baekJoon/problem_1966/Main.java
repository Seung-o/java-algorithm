package problem_1966;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Document implements Comparable<Document> {
    int index, priority;

    public Document(int index, int priority) {
        this.index = index;
        this.priority = priority;
    }

    @Override
    public int compareTo(Document o) {
        return this.priority - o.priority;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < testCases; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(stringTokenizer.nextToken());
            int M = Integer.parseInt(stringTokenizer.nextToken());

            Queue<Document> queue = new LinkedList<>();

            StringTokenizer elements = new StringTokenizer(br.readLine());

            for (int j = 0; j < N; j++) {
                int e = Integer.parseInt(elements.nextToken());
                queue.offer(new Document(j, e));
            }

            answer.append(main.solution(N, M, queue)).append("\n");
        }
        System.out.println(answer);
    }

    public int solution(int N, int M, Queue<Document> queue) {

        int maxPriority = Collections.max(queue).priority;
        int count = 0;

        while (!queue.isEmpty()) {
            Document peeked = queue.peek();

            if (peeked.priority == maxPriority) {
                queue.poll();
                count++;

                if (peeked.index == M) return count;
                maxPriority = Collections.max(queue).priority;
            } else {
                queue.offer(queue.poll());
            }
        }

        return count;
    }
}
