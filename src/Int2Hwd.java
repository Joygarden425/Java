import java.util.Scanner;

public class Int2Hwd {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("숫자를 입력하시오 :");
		
		int num = input.nextInt();
		
		switch(num) {
		
		case 1: 
			System.out.println("하나");
			break;
			
		case 2:
			System.out.println("둘");
			break;
			
		default:
			System.out.println("없음");
			break;
		}

	}

}
