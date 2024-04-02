
public class KoreanChar {

	public static void main(String[] args) {
		char uni = '\uAC00';
		do{
			System.out.print(uni);
			uni++;
			if(uni=='\uB098'|| uni=='\uB2E4'||uni=='\uB2E4'||uni=='\uB77C'||uni=='\uB9C8'||uni=='\uEC14'||uni=='\uC0AC'
					||uni=='\uC544'||uni=='\uC790'||uni=='\uCC28'||uni=='\uCE74'||uni=='\uD0C0'||uni=='\uD30C'||uni=='\uD558') {
				System.out.println("--…--");
			}
		}
		while(uni<='\uD7A3');
			
			
			
		
	}
	}
