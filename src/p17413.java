import java.util.Scanner;
import java.util.Stack;

public class p17413 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 사용자로부터 입력을 받습니다.
        String input = scanner.nextLine();
        // 입력된 문자열을 처리하여 결과를 출력합니다.
        reverseOutsideBrackets(input);
        scanner.close();
    }

    public static void reverseOutsideBrackets(String input) {
        Stack<Character> stack = new Stack<>();
        boolean insideBrackets = false;
        // 결과를 저장할 StringBuilder 객체를 생성합니다.
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (currentChar == '<') {
                // 괄호가 열리면 스택을 비우고 결과에 추가합니다.
                insideBrackets = true;
                emptyStackToResult(stack, result);
                // 여는 괄호를 결과에 추가합니다.
                result.append('<');
            } else if (currentChar == '>') {
                // 닫는 괄호를 결과에 추가하고, 괄호 안의 상태를 해제합니다.
                result.append('>');
                insideBrackets = false;
            } else {
                if (insideBrackets) {
                    // 괄호 안에 있는 문자들은 그대로 결과에 추가합니다.
                    result.append(currentChar);
                } else {
                    if (currentChar == ' ') {
                        // 빈칸을 만나면 스택을 비우고 결과에 추가합니다.
                        emptyStackToResult(stack, result);
                        // 빈칸을 결과에 추가합니다.
                        result.append(' ');
                    } else {
                        // 괄호 밖의 문자들은 스택에 푸시합니다.
                        stack.push(currentChar);
                    }
                }
            }
        }
        // 최종적으로 스택에 남아있는 문자들을 결과에 추가합니다.
        emptyStackToResult(stack, result);
        // 결과를 출력합니다.
        System.out.println(result.toString());
    }

    // 스택을 비우고 그 내용을 결과에 추가하는 메서드입니다.
    private static void emptyStackToResult(Stack<Character> stack, StringBuilder result) {
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
    }
}
