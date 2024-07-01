import java.util.Scanner;
import java.util.Stack;

public class p10799 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Stack<Character> stack = new Stack<Character>();
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar == '(') {
                stack.push(currentChar);
            } else {
                if (input.charAt(i - 1) == '(') {
                    stack.pop();
                    count += stack.size();
                } else {
                    stack.pop();
                    count += 1;
                }
            }
        }

        System.out.println(count);
    }
}
