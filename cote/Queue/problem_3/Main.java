package Queue.problem_3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] input = new int[N];
        for (int i = 0; i < N; i++) {
            input[i] = scanner.nextInt();
        }
        int result = main.solution(N, M, input);
        System.out.println(result);
    }

    public int solution(int N, int M, int[] input) {
        int count = 0;
        Queue<Person> queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            Person person = new Person(input[i], i);
            queue.offer(person);
        }

        while (!queue.isEmpty()) {
            Person pickedPerson = queue.poll();
            boolean isMax = true;
            for (Person x : queue) {
                if (x.getPriority() > pickedPerson.getPriority()) {
                    isMax = false;
                    break;
                }
            }

            if (isMax) {
                count++;
                if (pickedPerson.getIndex() == M) break;
            } else {
                queue.offer(pickedPerson);
            }
        }

        return count;
    }

    class Person {
        private int priority;
        private int index;

        public Person(int priority, int index) {
            this.setPriority(priority);
            this.setIndex(index);
        }

        public int getPriority() {
            return this.priority;
        }

        private void setPriority(int priority) {
            this.priority = priority;
        }

        public int getIndex() {
            return this.index;
        }

        private void setIndex(int index) {
            this.index = index;
        }
    }
}
