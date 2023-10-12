package dynamic_prorgramming.problem_4;

import java.util.Arrays;
import java.util.Scanner;

class Brick implements Comparable<Brick> {
    int size;
    int height;
    int weight;

    public Brick(int size, int height, int weight) {
        this.size = size;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Brick o) {
        return o.size - this.size;
    }
}

public class Main {

    public static int[] dy;

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Brick[] bricks = new Brick[N];
        for (int i = 0; i < N; i++) bricks[i] = new Brick(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        Arrays.sort(bricks);
        dy = new int[N];

        int answer = main.solution(bricks);
        System.out.println(answer);
    }

    public int solution(Brick[] bricks) {
        dy[0] = bricks[0].height;
        int answer = dy[0];

        for (int i = 1; i < bricks.length; i++) {
            dy[i] = bricks[i].height;
            for (int j = i - 1; j >= 0; j--) {
                if (bricks[j].weight > bricks[i].weight) {
                    dy[i] = Math.max(dy[i], dy[j] + bricks[i].height);
                }
            }
            answer = Math.max(answer, dy[i]);
        }

        return answer;
    }
}
