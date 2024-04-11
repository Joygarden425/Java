
public class Television {
	private int channel;
	public int volume;
	public boolean onOff;
	
	
	void print() {
		System.out.println("텔레비전의 채널은"+ channel+"이고 볼륨은"+ volume+"입니다.");
	}
	public String toString() {
		return "텔레비전의 채널은"+ channel+"이고 볼륨은 "+ volume+ "입니다.";
	}
	
	public void setChannel(int newChannel) {
		//if(newChannel)
		//channel = newChannel;
	}
}