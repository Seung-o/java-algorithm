package hash.memory_score;

import java.util.HashMap;

public class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        HashMap<String, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < name.length; i++) {
            hashMap.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; i++) {
            int sum = 0;
            for (int j = 0; j < photo[i].length; j++) {
                sum += hashMap.getOrDefault(photo[i][j], 0);
            }
            answer[i] = sum;
        }


        return answer;
    }
}