package greedy.problem_4;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Lecture implements Comparable<Lecture> {
    public int M;
    public int D;

    public Lecture(int M, int D) {
        this.M = M;
        this.D = D;
    }

    @Override
    public int compareTo(Lecture o) {
        return o.D - D;
    }
}

public class Main {

    public static int maxDay = -1;

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Lecture[] lectures = new Lecture[N];
        for (int i = 0; i < N; i++) {
            int M = scanner.nextInt();
            int D = scanner.nextInt();
            lectures[i] = new Lecture(M, D);
            maxDay = Math.max(maxDay, D);
        }
        int answer = main.solution(lectures);
        System.out.println(answer);
    }

    public int solution(Lecture[] lectures) {
        int answer = 0;
        Arrays.sort(lectures);
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());

        int idx = 0;

        for (int i = maxDay; i > 0; i--) {

            while (idx < lectures.length) {
                if (lectures[idx].D == i) {
                    pQ.offer(lectures[idx].M);
                    idx++;
                } else {
                    break;
                }
            }

            if (!pQ.isEmpty()) answer += pQ.poll();
        }

        return answer;
    }
}
