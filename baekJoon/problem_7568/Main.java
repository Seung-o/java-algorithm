package problem_7568;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Size implements Comparable<Size> {
    int id, weight, height, rank = 1;

    public Size(int id, int weight, int height) {
        this.id = id;
        this.weight = weight;
        this.height = height;
    }

    public static int getId(Size s) {
        return s.id;
    }

    @Override
    public int compareTo(Size o) {
        if (weight > o.weight && height > o.height) {
            return -1;
        } else if (weight <= o.weight && height >= o.height) {
            return 0;
        } else if (weight >= o.weight && height <= o.height) {
            return 0;
        } else {
            return 1;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        ArrayList<Size> arr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            arr.add(new Size(i, scanner.nextInt(), scanner.nextInt()));
        }

        Collections.sort(arr);
        for (int i = 0; i < N; i++) {
            if (i == 0) {
                arr.get(i).rank = i + 1;
            } else {
                if (arr.get(i).compareTo(arr.get(i - 1)) == 0) {
                    arr.get(i).rank = arr.get(i - 1).rank;
                } else {
                    arr.get(i).rank = i + 1;
                }
            }

        }

        StringBuilder answer = new StringBuilder();


        Collections.sort(arr, Comparator.comparingInt(Size::getId));

        for (Size size : arr) {
            answer.append(size.rank + " ");
        }

        System.out.println(answer);

    }
}
