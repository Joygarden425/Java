import java.util.Scanner;
public class Lec2Ex1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("두 정수를 입력하세요 :");
		int a = input.nextInt();
		int b = input.nextInt();
		
		if(a>b) {
			System.out.println(a);
		}
		else if(a<b){
			System.out.println(b);	
		}
		else {
			System.out.println("두 정수가 같습니다.");
		}
	}
}
