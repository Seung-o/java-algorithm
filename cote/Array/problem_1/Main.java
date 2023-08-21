package Array.problem_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        solution(arr);
    }

    public static void solution(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();

        result.add(arr[0]);

        for(int i = 1; i < arr.length; i++) {
            if(arr[i-1] < arr[i]) result.add(arr[i]);
        }

        Iterator it = result.iterator();

        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
