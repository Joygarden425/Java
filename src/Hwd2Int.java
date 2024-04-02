import java.util.Scanner;

public class Hwd2Int {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("문자를 입력하시오 :");
		
		String HwdNum = input.next();
		
		switch(HwdNum) {
		
		case "하나" : 
		case "일" : 
		case "첫째" : 
			System.out.println(1);
			break;
			
		case "둘":
		case "이" : 
		case "둘째" : 
			System.out.println(2);
			break;
			
		default:
			System.out.println("없음");
			break;
		}

	}

}
