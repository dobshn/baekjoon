import java.util.Scanner;

public class p10828 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine().trim());

        Stack myStack = new Stack(N);

        for (int i = 0; i < N; i++) {
            String cmdLine = scanner.nextLine().trim(); // 한 줄을 읽고 공백을 제거
            String[] cmdParts = cmdLine.split(" ");

            String cmd = cmdParts[0];

            switch (cmd) {
                case "push":
                    int value = Integer.parseInt(cmdParts[1]);
                    myStack.push(value);
                    break;

                case "pop":
                    myStack.pop();
                    break;

                case "size":
                    myStack.size();
                    break;

                case "empty":
                    myStack.empty();
                    break;

                case "top":
                    myStack.top();
                    break;
            }
        }
        scanner.close();
    }
}

class Stack {
    // stack을 구현하는 array
    int[] stackArray;
    // stack의 가장 끝 부분의 index (초기값: 0)
    int currentIndex;

    // size를 입력받아 stack 생성하는 constructor
    public Stack(int size) {
        stackArray = new int[size];
    }

    public void push(int X) {
        if (currentIndex < stackArray.length) {
            stackArray[currentIndex] = X;
            currentIndex++;
        }
    }

    public void pop() {
        if (currentIndex == 0) System.out.println(-1);
        else {
            currentIndex--;
            System.out.println(stackArray[currentIndex]);
        }
    }

    public void size() {
        System.out.println(currentIndex);
    }

    public void empty() {
        if (currentIndex == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    public void top() {
        if (currentIndex == 0) {
            System.out.println(-1);
        } else {
            System.out.println(stackArray[currentIndex - 1]);
        }
    }
}