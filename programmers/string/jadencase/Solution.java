package string.jadencase;

public class Solution {
    public String solution(String s) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);

            if (i == 0 || s.charAt(i - 1) == ' ') {
                if (Character.isAlphabetic(cur)) {
                    answer += Character.toUpperCase(cur);
                } else {
                    answer += cur;
                }
            } else {
                answer += Character.toLowerCase(cur);
            }

        }

        return answer;
    }
}