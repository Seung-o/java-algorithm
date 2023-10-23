package problem_1759;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static int L, C;
    public static char[] arr;
    public static HashMap<String, Integer> hashMap = new HashMap<>();
    public static ArrayList<String> answer = new ArrayList<>();

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        L = scanner.nextInt();
        C = scanner.nextInt();
        arr = new char[C];
        for (int i = 0; i < C; i++) arr[i] = scanner.next().charAt(0);
        Arrays.sort(arr);
        main.DFS(0, Character.toString(arr[0]));
        main.DFS(0, "");

        for (String x : answer) System.out.println(x);

    }

    public void DFS(int index, String str) {

        String key = isVowel(arr[index]) ? "Vowel" : "Consonant";
        hashMap.put(key, hashMap.getOrDefault(key, 0) + 1);
        System.out.println("str: " + str);
        System.out.println("Vowel: " + hashMap.getOrDefault("Vowel", 0));
        System.out.println("Consonant: " + hashMap.getOrDefault("Consonant", 0));

        if (str.length() == L) {
            if (hashMap.getOrDefault("Vowel", 0) >= 1 && hashMap.getOrDefault("Consonant", 0) >= 2) {
                answer.add(str);
            }
            hashMap.put(key, hashMap.get(key) - 1);
            System.out.println("=========================");
        } else {
            if (index + 1 < arr.length) {
                DFS(index + 1, str + arr[index + 1]);
                hashMap.put(key, hashMap.get(key) - 1);
                DFS(index + 1, str);
            }
        }
    }

    public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
