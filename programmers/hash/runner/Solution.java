package hash.runner;

import java.util.HashMap;

public class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> participantMap = new HashMap<>();
        HashMap<String, Integer> completionMap = new HashMap<>();

        for (int i = 0; i < participant.length; i++) {
            participantMap.put(participant[i], participantMap.getOrDefault(participant[i], 0) + 1);
        }

        for (int i = 0; i < completion.length; i++) {
            completionMap.put(completion[i], completionMap.getOrDefault(completion[i], 0) + 1);
        }

        for (String key : participantMap.keySet()) {
            participantMap.put(key, participantMap.get(key) - completionMap.getOrDefault(key, 0));
            if (participantMap.get(key) > 0) answer = key;
        }

        return answer;
    }
}