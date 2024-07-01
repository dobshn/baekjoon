import java.util.Scanner;
import java.util.Stack;

public class p1406 {
    public static void main(String[] args) {
        Stack<Character> cursorLeft = new Stack<Character>();
        Stack<Character> cursorRight = new Stack<Character>();

        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        for (char ch : inputString.toCharArray()) {
            cursorLeft.push(ch);
        }

        int M = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < M ; i++) {
            String commend = scanner.next();

            switch (commend) {
                case "L": {
                    moveToLeft(cursorLeft, cursorRight);
                    break;
                }
                case "D": {
                    moveToRight(cursorLeft, cursorRight);
                    break;
                }
                case "B": {
                    deleteLeft(cursorLeft);
                    break;
                }
                case "P": {
                    char ch = scanner.next().charAt(0);
                    addLeft(cursorLeft, ch);
                    break;
                }
            }
        }

        System.out.println(buildFinalString(cursorLeft, cursorRight));

    }

    public static void moveToLeft(Stack<Character> left, Stack<Character> right) {
        if (!left.isEmpty()) {
            right.push(left.pop());
        }
    }

    public static void moveToRight(Stack<Character> left, Stack<Character> right) {
        if (!right.isEmpty()) {
            left.push(right.pop());
        }
    }

    public static void deleteLeft(Stack<Character> left) {
        if (!left.isEmpty()) {
            left.pop();
        }
    }

    public static void addLeft(Stack<Character> left, Character ch) {
        left.push(ch);
    }

    public static String buildFinalString(Stack<Character> left, Stack<Character> right){
        StringBuilder result = new StringBuilder();

        for (char c : left) {
            result.append(c);
        }

        while (!right.isEmpty()) {
            result.append(right.pop());
        }

        return result.toString();
    }
}
