package problem_11651;

import java.util.Arrays;
import java.util.Scanner;

class Point implements Comparable<Point> {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point p) {
        if (p.y == y) {
            return x - p.x;
        }
        return y - p.y;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Point[] points = new Point[N];
        for (int i = 0; i < N; i++) {
            points[i] = new Point(scanner.nextInt(), scanner.nextInt());
        }
        Arrays.sort(points);
        for (Point p : points) {
            System.out.println(p.x + " " + p.y);
        }
    }
}
