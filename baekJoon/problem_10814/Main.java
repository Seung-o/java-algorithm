package problem_10814;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        TreeMap<Integer, LinkedList<String>> treeMap = new TreeMap<>();
        for (int i = 0; i < N; i++) {
            int age = scanner.nextInt();
            String name = scanner.next();

            LinkedList<String> list = treeMap.getOrDefault(age, new LinkedList<>());
            list.offer(name);
            treeMap.put(age, list);
        }

        for (int age : treeMap.keySet()) {
            for (String name : treeMap.get(age)) {
                System.out.println(age + " " + name);
            }
        }
    }
}
