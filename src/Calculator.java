import java.awt.*;
import javax.swing.*;

public class Calculator extends JFrame{
	
	public Calculator()
	{
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Calculator");
		
		JPanel panel = new JPanel();
		JPanel t_panel = new JPanel();
		JPanel b_panel = new JPanel();
		
		panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
		b_panel.setLayout(new GridLayout(0,5));
		add(panel);
		panel.add(t_panel);
		panel.add(b_panel);
		
		JTextField field1 = new JTextField(50);
		t_panel.add(field1);
			
		JButton bt_backspace = new JButton("Backspace");
		JButton bt_blank1 = new JButton(" ");
		JButton bt_blank2 = new JButton(" ");
		JButton bt_CE = new JButton("CE");
		JButton bt_C = new JButton("C");
		JButton bt_devide = new JButton("/");
		JButton bt_sqrt = new JButton("sqrt");
		JButton bt_multi = new JButton("x");
		JButton bt_mod = new JButton("%");
		JButton bt_minus = new JButton("-");
		JButton bt_plus = new JButton("+");
		JButton bt_inverse = new JButton("1/x");
		JButton bt_result = new JButton("=");
		JButton bt_plusminus = new JButton("+/-");
		JButton bt_dot = new JButton(".");
		JButton bt_0 = new JButton("0");
		JButton bt_1 = new JButton("1");
		JButton bt_2 = new JButton("2");
		JButton bt_3 = new JButton("3");
		JButton bt_4 = new JButton("4");
		JButton bt_5 = new JButton("5");
		JButton bt_6 = new JButton("6");
		JButton bt_7 = new JButton("7");
		JButton bt_8 = new JButton("8");
		JButton bt_9 = new JButton("9");
		
		
		b_panel.add(bt_backspace);
		b_panel.add(bt_blank1);
		b_panel.add(bt_blank2);
		b_panel.add(bt_CE);
		b_panel.add(bt_C);
		b_panel.add(bt_7);
		b_panel.add(bt_8);
		b_panel.add(bt_9);
		b_panel.add(bt_devide);
		b_panel.add(bt_sqrt);
		b_panel.add(bt_4);
		b_panel.add(bt_5);
		b_panel.add(bt_6);
		b_panel.add(bt_multi);
		b_panel.add(bt_mod);
		b_panel.add(bt_1);
		b_panel.add(bt_2);
		b_panel.add(bt_3);
		b_panel.add(bt_minus);
		b_panel.add(bt_inverse);
		b_panel.add(bt_0);
		b_panel.add(bt_plusminus);
		b_panel.add(bt_dot);
		b_panel.add(bt_plus);
		b_panel.add(bt_result);
		
		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		
		Calculator Cal = new Calculator();

	}

}



