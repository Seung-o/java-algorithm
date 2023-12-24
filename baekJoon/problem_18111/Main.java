package problem_18111;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer basicInfo = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(basicInfo.nextToken());
        int M = Integer.parseInt(basicInfo.nextToken());
        int B = Integer.parseInt(basicInfo.nextToken());

        int[][] ground = new int[N][M];
        int maxHeight = Integer.MIN_VALUE;
        int minHeight = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int j = 0; j < M; j++) {
                ground[i][j] = Integer.parseInt(stringTokenizer.nextToken());
                maxHeight = Math.max(maxHeight, ground[i][j]);
                minHeight = Math.min(minHeight, ground[i][j]);
            }
        }

        int minConsumedTime = Integer.MAX_VALUE;
        int finalHeight = minHeight;

        for (int height = minHeight; height <= maxHeight; height++) {
            int time = main.getConsumedTime(N, M, B, ground, height);
            if (time <= minConsumedTime) {
                minConsumedTime = time;
                finalHeight = height;
            }
        }

        System.out.println(minConsumedTime + " " + finalHeight);
    }

    public int getConsumedTime(int N, int M, int B, int[][] ground, int targetHeight) {

        int time = 0;
        int blockRemained = B;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (ground[i][j] < targetHeight) {
                    int delta = targetHeight - ground[i][j];
                    time += delta;
                    blockRemained -= delta;
                } else if (ground[i][j] > targetHeight) {
                    int delta = ground[i][j] - targetHeight;
                    time += (2 * delta);
                    blockRemained += delta;
                }
            }
        }

        if (blockRemained >= 0) return time;
        else return Integer.MAX_VALUE;
    }
}
