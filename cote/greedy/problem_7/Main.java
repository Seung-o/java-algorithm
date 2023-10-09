package greedy.problem_7;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

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

    public static int[] check;

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int V = scanner.nextInt();
        int E = scanner.nextInt();


        check = new int[V + 1];


        ArrayList<ArrayList<Edge>> arrayList = new ArrayList<>();

        for (int i = 0; i <= V; i++) {
            arrayList.add(new ArrayList<Edge>());
        }

        for (int i = 0; i < E; i++) {
            int vertex1 = scanner.nextInt();
            int vertex2 = scanner.nextInt();
            int cost = scanner.nextInt();

            arrayList.get(vertex1).add(new Edge(vertex2, cost));
            arrayList.get(vertex2).add(new Edge(vertex1, cost));
        }

        int answer = main.solution(1, arrayList);


        System.out.println(answer);
    }

    public int solution(int start, ArrayList<ArrayList<Edge>> arrayList) {

        int answer = 0;

        PriorityQueue<Edge> pQ = new PriorityQueue<>();
        pQ.offer(new Edge(start, 0));

        while (!pQ.isEmpty()) {
            Edge cur = pQ.poll();

            if (check[cur.vertex] == 1) continue;

            check[cur.vertex] = 1;
            answer += cur.cost;

            for (Edge edge : arrayList.get(cur.vertex)) {
                pQ.offer(edge);
            }
        }

        return answer;
    }
}
