package DFS.problem_9;

import java.util.ArrayList;
import java.util.Scanner;

class Point {
    public int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {

    public static int N, M, answer = Integer.MAX_VALUE;
    public static int[] combination;
    public static int[][] distance;

    public static ArrayList<Point> house = new ArrayList<>();
    public static ArrayList<Point> pizzaHouse = new ArrayList<>();

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();

        combination = new int[M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int point = scanner.nextInt();
                if (point == 1) house.add(new Point(i, j));
                if (point == 2) pizzaHouse.add(new Point(i, j));
            }
        }

        distance = new int[house.size()][pizzaHouse.size()];
        for (int i = 0; i < house.size(); i++) {
            for (int j = 0; j < pizzaHouse.size(); j++) {
                distance[i][j] = getDistance(house.get(i), pizzaHouse.get(j));
            }
        }

        main.DFS(0, 0);
        System.out.println(answer);

    }

    public static int getDistance(Point p1, Point p2) {
        return Math.abs(p1.x - p2.x) + Math.abs(p1.y - p2.y);
    }

    public void DFS(int L, int S) {
        if (L == M) {
            int distance = getTotalDistance();
            answer = Math.min(answer, distance);
        } else {
            for (int i = S; i < pizzaHouse.size(); i++) {
                combination[L] = i;
                DFS(L + 1, i + 1);
            }
        }
    }

    public int getTotalDistance() {
        int sum = 0;
        for (int i = 0; i < house.size(); i++) {
            int min = distance[i][0];
            for (int j = 0; j < pizzaHouse.size(); j++) {
                if (isSelected(j)) min = Math.min(min, distance[i][j]);
            }
            sum += min;
        }
        return sum;
    }

    public boolean isSelected(int x) {
        boolean flag = false;
        for (int i = 0; i < combination.length; i++) {
            if (combination[i] == x) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
