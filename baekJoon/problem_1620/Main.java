package problem_1620;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<Integer, String> hashMap = new HashMap<>();
        HashMap<String, Integer> reversedHashMap = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            hashMap.put(i, name);
            reversedHashMap.put(name, i);
        }

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < M; i++) {
            String problem = (br.readLine());

            if (main.isInteger(problem)) {
                answer.append(hashMap.get(Integer.parseInt(problem))).append("\n");
            } else {
                answer.append(reversedHashMap.get(problem)).append("\n");
            }
        }

        System.out.println(answer);
    }

    public boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}
