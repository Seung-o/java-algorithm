package problem_1181;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        TreeMap<Integer, TreeSet<String>> treeMap = new TreeMap<>();
        for (int i = 0; i < N; i++) {
            String str = scanner.next();
            TreeSet<String> treeSet = treeMap.getOrDefault(str.length(), new TreeSet<>());
            treeSet.add(str);
            treeMap.put(str.length(), treeSet);
        }

        for (int key : treeMap.keySet()) {
            for (String x : treeMap.get(key)) {
                System.out.println(x);
            }
        }
    }
}
