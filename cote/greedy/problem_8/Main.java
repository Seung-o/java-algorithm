package greedy.problem_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * problem_7 을 Union & Find 를 사용하여 풀이
 */

class Edge implements Comparable<Edge> {
    int v1, v2;
    int cost;

    public Edge(int v1, int v2, int cost) {
        this.v1 = v1;
        this.v2 = v2;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge e) {
        return cost - e.cost;
    }
}

public class Main {

    public static int[] unf;

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int V = scanner.nextInt();
        unf = new int[V + 1];
        for (int i = 0; i < V + 1; i++) unf[i] = i;

        int E = scanner.nextInt();
        ArrayList<Edge> graph = new ArrayList<>();
        for (int i = 0; i < E; i++) {
            graph.add(new Edge(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
        }
        int answer = main.solution(graph);
        System.out.println(answer);

    }

    public int solution(ArrayList<Edge> graph) {
        int answer = 0;
        Collections.sort(graph);

        for (Edge edge : graph) {
            int g1 = find(edge.v1);
            int g2 = find(edge.v2);
            if (g1 != g2) {
                union(edge.v1, edge.v2);
                answer += edge.cost;
            }
        }

        return answer;
    }

    public int find(int idx) {
        if (idx == unf[idx]) return unf[idx];
        return unf[idx] = find(unf[idx]);
    }

    public void union(int v1, int v2) {
        int g1 = find(v1);
        int g2 = find(v2);
        unf[g1] = g2;
    }
}
