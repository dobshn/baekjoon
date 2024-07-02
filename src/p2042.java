import java.util.Arrays;
import java.util.Scanner;

// 구간 합 구하기
public class p2042 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.nextLine();

        // N개의 수를 array에 입력받기
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int i = 0; i < M + K; i++) {
            int command = scanner.nextInt();
            if (command == 1) {
                int index = scanner.nextInt() - 1;
                int number = scanner.nextInt();
                numbers[index] = number;
            } else if (command == 2){
                int startIndex = scanner.nextInt() - 1;
                int endIndex = scanner.nextInt() - 1;
                int sum = 0;
                for (int j = startIndex; j <= endIndex; j++) {
                    sum += numbers[j];
                }
                System.out.println(sum);
                scanner.nextLine();
            }
        }
    }
}
