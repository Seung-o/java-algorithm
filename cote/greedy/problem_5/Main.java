package greedy.problem_5;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Dijkstra Algorithm
 */

class Edge implements Comparable<Edge> {
    int vertex;
    int cost;

    public Edge(int vertex, int cost) {
        this.vertex = vertex;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge e) {
        return cost - e.cost;
    }
}

public class Main {

    public static int[] distance;

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        /* Initialization */
        distance = new int[N + 1];

        for (int i = 1; i < N + 1; i++) {
            distance[i] = Integer.MAX_VALUE;
        }

        ArrayList<ArrayList<Edge>> arrayList = new ArrayList<>(N + 1);

        for (int i = 0; i < N + 1; i++) {
            arrayList.add(new ArrayList<Edge>());
        }

        for (int i = 0; i < M; i++) {
            int from = scanner.nextInt();
            int vertex = scanner.nextInt();
            int cost = scanner.nextInt();
            ArrayList<Edge> edges = arrayList.get(from);
            edges.add(new Edge(vertex, cost));
        }

        main.solution(1, arrayList);

        for (int i = 1; i < N + 1; i++) {
            if (distance[i] < Integer.MAX_VALUE) {
                System.out.println(i + ": " + distance[i]);
            } else {
                System.out.println(i + ": impossible");
            }
        }
    }

    public void solution(int start, ArrayList<ArrayList<Edge>> arrayList) {
        PriorityQueue<Edge> pQ = new PriorityQueue<>();

        distance[start] = 0;
        pQ.offer(new Edge(start, 0));

        while (!pQ.isEmpty()) {

            Edge cur = pQ.poll();
            int curVertex = cur.vertex;
            int curCost = cur.cost;
            ArrayList<Edge> curEdges = arrayList.get(curVertex);

            for (int i = 0; i < curEdges.size(); i++) {
                Edge edge = curEdges.get(i);
                int cost = edge.cost + curCost;

                if (cost > distance[edge.vertex]) continue;

                if (distance[edge.vertex] > cost) {
                    distance[edge.vertex] = cost;
                    pQ.offer(new Edge(edge.vertex, cost));
                }
            }
        }
    }
}

