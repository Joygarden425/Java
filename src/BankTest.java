
public class BankTest {

	public static void main(String[] args) {
		BadBank bank1 = new BadBank();
		GoodBank bank3 = new GoodBank();
		
		System.out.println("BadBank의 이자율:"+bank1.getInterestRate());
		System.out.println("GoodBank의 이자율:"+bank3.getInterestRate());
//		System.out.println("BadBank의 이자율:"+bank[0].getInterestRate());

	}

}
