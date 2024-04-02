import java.util.Arrays;
import java.util.Scanner;

public class MedianFive {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] num = new int[5];
        System.out.println("5개의 양수를 입력하세요:");
        for (int i = 0; i < 5; i++) {
            num[i] = scanner.nextInt();
        }

        Arrays.sort(num);

        System.out.println("가운데 값: " + num[2]); 
        scanner.close();
    }
}
