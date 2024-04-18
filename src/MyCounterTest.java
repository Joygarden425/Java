
public class MyCounterTest {
	//기초변수

	public static void main(String[] args) {
		MyCounter obj = new MyCounter();
		MyCounter obj2 = new MyCounter();
		obj2.value = 10;
		int x = 10;
//		obj.inc(x);
		obj2.inc(obj2);
		System.out.println("x="+x);
		System.out.println("x="+obj2.value);
		
		//참조변수
		

	}

}
