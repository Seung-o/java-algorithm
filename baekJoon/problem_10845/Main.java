package problem_10845;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static StringBuilder stringBuilder = new StringBuilder();
    public static Queue<Integer> queue = new LinkedList<>();
    public static int lastValue = -1;

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer input = new StringTokenizer(br.readLine());
            main.solution(input);
        }
        System.out.println(stringBuilder.toString());
    }

    public void solution(StringTokenizer command) {

        String mainCommand = command.nextToken();

        if (mainCommand.equals("push")) {
            int cur = Integer.parseInt(command.nextToken());
            queue.offer(cur);
            lastValue = cur;
        } else {
            if (mainCommand.equals("pop")) {
                if (queue.isEmpty()) stringBuilder.append(-1);
                else stringBuilder.append(queue.poll());
            } else if (mainCommand.equals("size")) {
                stringBuilder.append(queue.size());
            } else if (mainCommand.equals("empty")) {
                if (queue.isEmpty()) stringBuilder.append(1);
                else stringBuilder.append(0);
            } else if (mainCommand.equals("front")) {
                if (queue.isEmpty()) stringBuilder.append(-1);
                else stringBuilder.append(queue.peek());
            } else if (mainCommand.equals("back")) {
                if (queue.isEmpty()) stringBuilder.append(-1);
                else stringBuilder.append(lastValue);
            }

            stringBuilder.append("\n");
        }
    }
}
