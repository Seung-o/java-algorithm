package problem_2438;

public class Main {
    public static void main(String[] args) {
        int N = new java.util.Scanner(System.in).nextInt();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < N; i++) {
            stringBuilder.append("*");
            System.out.println(stringBuilder);
        }
    }
}
