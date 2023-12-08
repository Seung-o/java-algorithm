package problem_10866;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;


public class Main {

    public static StringBuilder answer = new StringBuilder();
    public static LinkedList<Integer> dequeue = new LinkedList<>();


    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            main.solution(stringTokenizer);
        }

        System.out.println(answer.toString());
    }

    public void solution(StringTokenizer command) {
        String mainCommand = command.nextToken();


        if (mainCommand.equals("push_front")) {
            int cur = Integer.parseInt(command.nextToken());
            dequeue.addFirst(cur);
        } else if (mainCommand.equals("push_back")) {
            int cur = Integer.parseInt(command.nextToken());
            dequeue.addLast(cur);
        } else {
            if (mainCommand.equals("pop_front")) {
                if (dequeue.isEmpty()) answer.append(-1);
                else answer.append(dequeue.pollFirst());
            } else if (mainCommand.equals("pop_back")) {
                if (dequeue.isEmpty()) answer.append(-1);
                else answer.append(dequeue.pollLast());
            } else if (mainCommand.equals("size")) {
                answer.append(dequeue.size());
            } else if (mainCommand.equals("empty")) {
                if (dequeue.isEmpty()) answer.append(1);
                else answer.append(0);
            } else if (mainCommand.equals("front")) {
                if (dequeue.isEmpty()) answer.append(-1);
                else answer.append(dequeue.getFirst());
            } else if (mainCommand.equals("back")) {
                if (dequeue.isEmpty()) answer.append(-1);
                else answer.append(dequeue.getLast());
            }

            answer.append("\n");
        }
    }
}
