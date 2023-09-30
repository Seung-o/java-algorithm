package problem_10828;

import java.util.Scanner;
import java.util.Stack;

class CustomStack {

    private final Stack<Integer> stack;

    public CustomStack() {
        stack = new Stack<>();
    }

    public int execute(String command) {

        String[] split = command.split(" ");

        if (split[0].equals("push")) {
            stack.push(Integer.parseInt(split[1]));
            return -999;
        } else if (split[0].equals("pop")) {
            return stack.isEmpty() ? -1 : stack.pop();
        } else if (split[0].equals("size")) {
            return stack.size();
        } else if (split[0].equals("empty")) {
            return stack.isEmpty() ? 1 : 0;
        } else if (split[0].equals("top")) {
            return stack.isEmpty() ? -1 : stack.peek();
        } else {
            return -999;
        }
    }
}

public class Main {

    public CustomStack stack = new CustomStack();

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        String[] input = new String[N];
        for (int i = 0; i < N; i++) {
            input[i] = scanner.nextLine();
        }

        for (String command : input) {
            main.solution(command);
        }

        scanner.close();
    }

    public void solution(String command) {

        int result = stack.execute(command);
        if (result != -999) {
            System.out.println(result);
        }

    }
}
