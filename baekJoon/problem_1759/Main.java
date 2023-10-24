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
        main.DFS(0, Character.toString(arr[0]), true);
        main.DFS(0, "", false);

        for (String x : answer) System.out.println(x);

    }

    public void DFS(int index, String str, boolean used) {
        String key = isVowel(arr[index]) ? "Vowel" : "Consonant";
        if (used) hashMap.put(key, hashMap.getOrDefault(key, 0) + 1);

        if (str.length() == L) {
            if (hashMap.getOrDefault("Vowel", 0) >= 1 && hashMap.getOrDefault("Consonant", 0) >= 2) {
                answer.add(str);
            }
        } else {
            if (index + 1 < arr.length) {
                DFS(index + 1, str + arr[index + 1], true);
                DFS(index + 1, str, false);
            }
        }

        if (used) hashMap.put(key, hashMap.get(key) - 1);
    }

    public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
