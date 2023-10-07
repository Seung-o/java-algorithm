package greedy.problem_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Attendance implements Comparable<Attendance> {
    public int time;
    public char state;

    public Attendance(int time, char state) {
        this.time = time;
        this.state = state;
    }

    @Override
    public int compareTo(Attendance o) {
        if (o.time == time) {
            return state - o.state;
        } else {
            return time - o.time;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        ArrayList<Attendance> attendances = new ArrayList<>();
        for (int i = 0; i < 2 * N; i++) {
            if (i % 2 == 0) attendances.add(new Attendance(scanner.nextInt(), 's'));
            else attendances.add(new Attendance(scanner.nextInt(), 'e'));
        }
        int answer = main.solution(attendances);
        System.out.println(answer);
    }

    public int solution(ArrayList<Attendance> attendances) {
        int answer = 0;
        int count = 0;
        Collections.sort(attendances);

        for (Attendance a : attendances) {
            if (a.state == 's') count++;
            else count--;

            answer = Math.max(answer, count);
        }


        return answer;
    }
}

