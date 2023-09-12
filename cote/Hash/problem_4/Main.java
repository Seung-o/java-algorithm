package Hash.problem_4;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        String T = scanner.next();
        int result = main.solution(S, T);
        System.out.println(result);
    }

    public int solution(String S, String T) {
        int result = 0;
        int lengthOfT = T.length();
        int lt = 0, rt = lengthOfT - 1;

        HashMap<Character, Integer> hashMapForS = new HashMap<>();
        HashMap<Character, Integer> hashMapForT = new HashMap<>();

        /** Initialize */

        for (int i = 0; i < T.length(); i++) {
            hashMapForS.put(S.charAt(i), hashMapForS.getOrDefault(S.charAt(i), 0) + 1);
        }

        for (int i = 0; i < T.length(); i++) {
            hashMapForT.put(T.charAt(i), hashMapForT.getOrDefault(T.charAt(i), 0) + 1);
        }


        if (isEqualHashMap(hashMapForS, hashMapForT)) result++;

        while (rt < S.length() - 1) {

            rt++;
            hashMapForS.put(S.charAt(rt), hashMapForS.getOrDefault(S.charAt(rt), 0) + 1);
            hashMapForS.put(S.charAt(lt), hashMapForS.get(S.charAt(lt)) - 1);

            if (hashMapForS.get(S.charAt(lt)) == 0) hashMapForS.remove(S.charAt(lt));

            if (isEqualHashMap(hashMapForS, hashMapForT)) result++;
            lt++;
        }

        return result;
    }

    private boolean isEqualHashMap(HashMap<Character, Integer> hashMap1, HashMap<Character, Integer> hashMap2) {
        boolean flag = true;

        for (char x : hashMap1.keySet()) {
            if (hashMap1.get(x) != hashMap2.getOrDefault(x, 0)) flag = false;
        }

        return flag;
    }
}
