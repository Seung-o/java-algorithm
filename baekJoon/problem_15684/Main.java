package problem_15684;

import java.util.Scanner;

class Line {
    public int position, from;

    public Line(int position, int from) {
        this.position = position;
        this.from = from;
    }
}

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int H = scanner.nextInt();

        Line[] horizontalLines = new Line[M];
        for (int i = 0; i < M; i++) horizontalLines[i] = new Line(scanner.nextInt(), scanner.nextInt());
        int answer = main.solution(N, M, H, horizontalLines);
        System.out.println(answer);
    }

    public int solution(int N, int M, int H, Line[] horizontalLines) {
        int answer = -1;

        return answer;
    }
}
