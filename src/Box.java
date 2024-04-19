
public class Box {
	private int width;
	private int length;
	private int height;
	
	
	Box(int w, int l, int h){
		width = w;
		length = l;
		height = h;
	}
	
	boolean isSameBox(Box obj) {
		if((obj.width==width)&(obj.length == length)&(obj.height==height))
			return true;
		else
			return false;
	}

}
