
public class MyCounter {

	public int value;
	//기초변수
//	public void inc(int a) {
//		a = a+1;
//	}
	//참조변수
	public void inc(MyCounter a) {
		a.value = a.value+1;
	}
}
