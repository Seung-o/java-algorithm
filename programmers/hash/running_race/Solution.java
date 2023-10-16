package hash.running_race;

import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        Solution main = new Solution();
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        String[] answer = main.solution(players, callings);
        for (String s : answer) System.out.println(s);
    }

    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            hashMap.put(players[i], i);
        }

        for (int i = 0; i < callings.length; i++) {
            String calledPlayer = callings[i];
            int calledRank = hashMap.get(calledPlayer);

            hashMap.put(calledPlayer, calledRank - 1);
            hashMap.put(players[calledRank - 1], calledRank);

            String temp = players[calledRank - 1];
            players[calledRank - 1] = players[calledRank];
            players[calledRank] = temp;
        }

        return players;
    }
}