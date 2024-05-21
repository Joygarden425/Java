
public class Television {
	private int channel;
	private int volume;
	private boolean onOff;
	
	//생성자  오버로딩
	public Television() {
		this(1,1,false);
	}
	
	public Television(int c) {
		this(c,1,false);
	}
	
	//생성자
	public Television(int c, int v, boolean o) {
		this.channel = c;
		this.volume = v;
		this.onOff = o;
		
	}
	
	
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