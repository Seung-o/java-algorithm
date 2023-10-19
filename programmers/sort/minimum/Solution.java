package sort.minimum;

import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;

        Arrays.sort(A);
        Integer[] newB = Arrays.stream(B).boxed().toArray(Integer[]::new);
        Arrays.sort(newB, Collections.reverseOrder());

        for (int i = 0; i < A.length; i++) {
            answer += A[i] * newB[i];
        }

        return answer;
    }
}