package greedy.problem_1;

import java.util.Arrays;
import java.util.Scanner;

class Person implements Comparable<Person> {
    int height;
    int weight;

    public Person(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }


    @Override
    public int compareTo(Person p) {
        return p.height - this.height;
    }
}

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Person[] input = new Person[N];
        for (int i = 0; i < N; i++) {
            int height = scanner.nextInt();
            int weight = scanner.nextInt();
            input[i] = new Person(height, weight);
        }
        int answer = main.solution(input);
        System.out.println(answer);
    }

    public int solution(Person[] people) {
        Arrays.sort(people);
        int answer = 0;
        int maxWeight = 0;

        for (int i = 0; i < people.length; i++) {
            if (i == 0 || people[i].weight > maxWeight) {
                answer++;
                maxWeight = people[i].weight;
            }
        }

        return answer;
    }
}
