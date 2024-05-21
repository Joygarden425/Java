
public class TelevisionTest {

	public static void main(String[] args) {
		Television tv = new Television();
		Television tv2 = new Television(7,10,true);
		tv.setChannel(7);
		tv.print();
		tv2.print();
//		System.out.println("텔레비전의 채널은"+ tv.channel+"이고 볼륨은"+tv.volume+"입니다.");

	}

}
 