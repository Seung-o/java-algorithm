package problem_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String answer = solution(input);
        System.out.println(answer);
    }

    public static String solution(String input){

        char[] charArr = input.toLowerCase().toCharArray();
        int lt = 0, rt = charArr.length -1;
        String answer = "YES";
        while(lt < rt) {
            if(charArr[lt] == charArr[rt]){
                lt++;
                rt--;
            } else {
                answer = "NO";
                break;
            }
        }

        return answer;
    }
}
