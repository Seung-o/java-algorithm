package hash.clothes;

import java.util.HashMap;

public class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            hashMap.put(clothes[i][1], hashMap.getOrDefault(clothes[i][1], 0) + 1);
        }

        for (String key : hashMap.keySet()) {
            answer *= (1 + hashMap.get(key));
        }

        answer -= 1;

        return answer;
    }
}