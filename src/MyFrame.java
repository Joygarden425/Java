import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{
	
	private int count =0;
	private JButton button1;
	private JButton button2;
	
	public MyFrame(String title) {
		setTitle(title);
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		button1 = new JButton("버튼");
		button1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("1번 버튼 클릭"+ count);
				count ++;
				
			}
		});
			
		
		this.add(button1);
		
		button2 = new JButton("버튼");
		this.add(button2);
		
		JButton button3 = new JButton("버튼");
		this.add(button3);
		
		setVisible(true);
		
	}
	
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton)e.getSource();
			
			count = count +1;
			System.out.println(btn.getText()+count);
			
			if(btn.getText()=="버튼")
				btn.setText("클릭");
			else
				btn.setText("버튼");	
			
			if(e.getSource()== button1)
				System.out.println("1번 버튼 클릭" + count);
//				label.setText("1번 버튼 클릭"+count);
			else if(e.getSource()==button2) {
				System.out.println("버튼2 눌렀습니다.");
			}
		}
		

}