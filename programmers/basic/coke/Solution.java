package basic.coke;

public class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;

        int cur = n;

        while (cur > 1) {
            int temp = cur / a;

            if (temp == 0) break;

            int cokeTaken = temp * b;
            answer += cokeTaken;
            cur = (cur % a) + cokeTaken;
        }

        return answer;
    }
}