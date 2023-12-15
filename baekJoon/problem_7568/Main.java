package problem_7568;

import java.util.ArrayList;
import java.util.Scanner;

class Size {
    int weight, height, rank = 1;

    public Size(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        ArrayList<Size> arr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            arr.add(new Size(scanner.nextInt(), scanner.nextInt()));
        }

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < N; i++) {

            int rank = 1;

            for (int j = 0; j < N; j++) {
                if (i == j) {
                    continue;
                }
                if (arr.get(i).weight < arr.get(j).weight && arr.get(i).height < arr.get(j).height) rank++;
            }

            answer.append(rank).append(" ");
        }

        System.out.println(answer);

    }
}
