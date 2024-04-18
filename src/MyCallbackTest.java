import java.awt.event.ActionListener;
import javax.swing.Timer;


public class MyCallbackTest {

	public static void main(String[] args) {
		ActionListener obj = new MyClass(); //프로젝트가 시작될 때 연결만 시켜놓으면 나머지 코드가 알아서 돌아가기에 인터페이스 사용
//		Timer t = new Timer(1000,obj);
		Timer t = new Timer(1000,event -> {System.out.println("beep");});//람다식
		t.start();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
