package greedy.problem_2;

import java.util.Arrays;
import java.util.Scanner;

class Meeting implements Comparable<Meeting> {
    public int startTime;
    public int endTime;

    public Meeting(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public int compareTo(Meeting m) {
        if (this.endTime != m.endTime) return this.endTime - m.endTime;
        else return this.startTime - m.startTime;
    }
}

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Meeting[] meetings = new Meeting[n];
        for (int i = 0; i < n; i++) {
            int startTime = scanner.nextInt();
            int endTime = scanner.nextInt();
            meetings[i] = new Meeting(startTime, endTime);
        }
        int answer = main.solution(meetings);
        System.out.println(answer);
    }

    public int solution(Meeting[] meetings) {
        int answer = 0;
        int lastEndTime = 0;

        Arrays.sort(meetings);

        for (int i = 0; i < meetings.length; i++) {
            if (i == 0 || meetings[i].startTime >= lastEndTime) {
                answer++;
                lastEndTime = meetings[i].endTime;
            }
        }

        return answer;
    }
}
