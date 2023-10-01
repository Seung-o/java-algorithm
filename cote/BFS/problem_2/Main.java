package BFS.problem_2;

import java.util.*;

public class Main {

    public static int[] stepForX = {-1, 1};
    public static int[] stepForY = {-1, 1};

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int N = 7;
        int[][] maze = new int[N + 1][N + 1];
        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < N + 1; j++) {
                maze[i][j] = scanner.nextInt();
            }
        }
        int answer = main.solution(maze, 7, 7);
        System.out.println(answer);

    }

    public int solution(int[][] maze, int goalForX, int goalForY) {
        Queue<ArrayList<Integer>> queue = new LinkedList<>();
        ArrayList<Integer> init = new ArrayList<>(Arrays.asList(1, 1, 0));
        queue.offer(init);

        int answer = -1;


        while (!queue.isEmpty()) {


            ArrayList<Integer> cur = queue.poll();
            int x = cur.get(0);
            int y = cur.get(1);
            int distance = cur.get(2);


            if (x == goalForX && y == goalForY) {
                answer = distance;
                break;
            }

            for (int dx : stepForX) {
                int nextX = x + dx;

                if (nextX >= 1 && nextX <= goalForX && maze[nextX][y] == 0) {
                    maze[nextX][y] = 1;
                    queue.offer(new ArrayList<>(Arrays.asList(nextX, y, distance + 1)));
                }
            }

            for (int dy : stepForY) {
                int nextY = y + dy;

                if (nextY >= 1 && nextY <= goalForY && maze[x][nextY] == 0) {
                    maze[x][nextY] = 1;
                    queue.offer(new ArrayList<>(Arrays.asList(x, nextY, distance + 1)));
                }
            }
        }

        return answer;
    }
}
