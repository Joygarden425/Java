import java.util.Scanner;

public class Lec3Ex2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("정수를 입력하세요 :");
		
		int num = input.nextInt();
//		for(int i = 1; i<= num; i++) {
//			if(num%i==0) {
//				System.out.println(i);
//			}
//		}
		
		for(int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
                if (i != num / i) {
                    System.out.print(num / i + " ");
                }
				
			}
		}

	}

}
