package problem_11723;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

class CustomSet {
    HashSet<Integer> set;
    StringBuilder answer;

    public CustomSet() {
        set = new HashSet<>();
        answer = new StringBuilder();
    }

    public void check(int n) {
        boolean isContained = set.contains(n);
        if (isContained) {
            answer.append("1").append("\n");
        } else {
            answer.append("0").append("\n");
        }
    }

    public void add(int n) {
        set.add(n);
    }

    public void remove(int n) {
        set.remove(n);
    }

    public void toggle(int n) {
        boolean isContained = set.contains(n);
        if (isContained) {
            remove(n);
        } else {
            add(n);
        }
    }

    public void empty() {
        set = new HashSet<>();
    }

    public void all() {
        set = new HashSet<>();
        for (int i = 1; i <= 20; i++) set.add(i);
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(bufferedReader.readLine());

        CustomSet set = new CustomSet();

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
            String command = st.nextToken();
            if (command.equals("all") || command.equals("empty")) {
                if (command.equals("all")) {
                    set.all();
                } else {
                    set.empty();
                }
                continue;
            }

            int n = Integer.parseInt(st.nextToken());

            if (command.equals("add")) {
                set.add(n);
            } else if (command.equals("remove")) {
                set.remove(n);
            } else if (command.equals("check")) {
                set.check(n);
            } else if (command.equals("toggle")) {
                set.toggle(n);
            }
        }

        System.out.println(set.answer.toString());
    }
}
