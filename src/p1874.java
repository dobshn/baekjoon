import java.util.Scanner;
import java.util.Stack;

public class p1874 {

    public static void main(String[] args) {
        Scanner scnner = new Scanner(System.in);
        int N = scnner.nextInt();
        int[] input = new int[N];

        for (int i = 0; i < N; i++) {
            input[i] = scnner.nextInt();
        }

        int count = 1;
        boolean isPossible = true;
        Stack<Integer> stack = new Stack<Integer>();
        StringBuilder answer = new StringBuilder();

        for (int target : input) {
            while (count <= target) {
                stack.push(count);
                count++;
                answer.append("+\n");
            }

            if (stack.peek() == target) {
                stack.pop();
                answer.append("-\n");
            } else {
                isPossible = false;
                break;
            }
        }

        if (isPossible) System.out.println(answer);
        else System.out.println("NO");
    }
}
