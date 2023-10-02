package hash.phoneketmon;

import java.util.HashMap;

public class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        int len = nums.length;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < len; i++) {
            hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0) + 1);
        }

        if (hashMap.size() >= len / 2) {
            answer = len / 2;
        } else {
            answer = hashMap.size();
        }

        return answer;
    }
}
