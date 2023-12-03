package problem_11650;

import java.util.Arrays;
import java.util.Scanner;

class Point implements Comparable<Point> {
    public int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if (x != o.x) {
            return x - o.x;
        }
        return y - o.y;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Point[] arr = new Point[N];
        for (int i = 0; i < N; i++) {
            arr[i] = new Point(scanner.nextInt(), scanner.nextInt());
        }
        Arrays.sort(arr);
        for (Point p : arr) {
            System.out.println(p.x + " " + p.y);
        }
    }
}
