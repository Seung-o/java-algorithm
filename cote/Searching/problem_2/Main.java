package Searching.problem_2;

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

    public int solution(int N, int M, int[] musics) {
        int answer = 0;
        int lt = -1, rt = 0;

        for (int music : musics) {
            if (music > lt) lt = music;
            rt += music;
        }

        while (lt <= rt) {
            int mid = (lt + rt) / 2;

            if (isIncludingAvailable(mid, musics, M)) {
                answer = mid;
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }


        }

        return answer;
    }

    public boolean isIncludingAvailable(int sizeOfDVD, int[] musics, int M) {
        int sum = 0;
        int count = 1;
        for (int i = 0; i < musics.length; i++) {
            sum += musics[i];
            if (sum > sizeOfDVD) {
                sum = musics[i];
                count++;
            }
        }


        return M >= count;
    }
}
