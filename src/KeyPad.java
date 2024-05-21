import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class KeyPad extends JFrame implements ActionListener {
	
	
	private int[] button;
	public KeyPad() {
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		
		setTitle("title");
		setSize(300,400);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i =0; i<9; i++) {
			if(e.getSource()==button[1])
				System.out.println("클릭1");
		}
	}
	
	
	

}
