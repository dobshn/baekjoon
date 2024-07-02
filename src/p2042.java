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
        System.out.println("N: " + N);
        System.out.println("M: " + M);
        System.out.println("K: " + K);

        // N개의 수를 array에 입력받기
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < M + K; i++) {
            if (scanner.nextInt() == 1) {
                int index = scanner.nextInt() - 1;
                int number = scanner.nextInt();
                numbers[index] = number;
                scanner.nextLine();
                System.out.println(index + "번째 인덱스에 " + number + "값으로 변경");
                System.out.println(Arrays.toString(numbers));
            } else if (scanner.nextInt() == 2){
                int startIndex = scanner.nextInt() - 1;
                int endIndex = scanner.nextInt() - 1;
                scanner.nextLine();
                System.out.println("시작 값: " + startIndex + "끝 값: " + endIndex);
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
