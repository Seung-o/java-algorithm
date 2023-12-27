package problem_1764;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < N; i++) {
            hashSet.add(br.readLine());
        }

        int count = 0;
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            String str = br.readLine();
            if (hashSet.contains(str)) {
                count++;
                arrayList.add(str);
            }
        }

        Collections.sort(arrayList);

        StringBuilder answer = new StringBuilder();

        answer.append(count).append("\n");

        for (String x : arrayList) answer.append(x).append("\n");

        System.out.println(answer);
    }
}
