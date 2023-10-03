package queue.process;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

class Process {
    int index;
    int priority;

    public Process(int index, int priority) {
        this.index = index;
        this.priority = priority;
    }
}

public class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        Queue<Process> queue = new LinkedList<>();
        TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>((k1, k2) -> k2 - k1);

        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new Process(i, priorities[i]));
            treeMap.put(priorities[i], treeMap.getOrDefault(priorities[i], 0) + 1);
        }


        while (!queue.isEmpty()) {

            Process p = queue.poll();
            int pr = treeMap.firstKey();

            if (p.priority == pr) {
                answer++;

                if (p.index == location) break;

                int count = treeMap.get(pr) - 1;

                if (count == 0) {
                    treeMap.remove(pr);
                } else {
                    treeMap.put(pr, count);
                }

            } else {
                queue.offer(p);
            }

        }

        return answer;
    }
}