import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;;

public class test02 extends JFrame{
	
	JPanel Panel = new JPanel();
	JLabel Label1 = new JLabel();
	JLabel Label2 = new JLabel();
	
	
	test02() {
		setTitle("X Y");
		setSize(200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Panel.setLayout(null);
		Label1.setLocation(20, 20);
		Label1.setSize(120,15);
		Label1.setText("Char Key: ");
		
		Label2.setLocation(20, 50);
		Label2.setSize(120,15);
		Label2.setText("Func Key: ");
		
		Panel.add(Label1);
		Panel.add(Label2);
		Panel.addKeyListener(new MyKeyListener());
		
		add(Panel);
		Panel.requestFocus(true);
/*		
		this.setLayout(new FlowLayout());
		JButton button = new JButton("Play");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton Button = (JButton)e.getSource();
				if(Button.getText().equals("Play"))
					Button.setText("Stop");
				else
					Button.setText("Play");
			}
		});
		add(button);
*/		
	}
	public class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			char cKey = e.getKeyChar();
			
			if (cKey == e.CHAR_UNDEFINED) {
				String str = "Func Key:" + e.getKeyText(e.getKeyCode());
				Label2.setText(str);
			} else {
				String str = "Cahr Key:" + cKey;
				Label1.setText(str);
			}
			
		}
	}
	/*
	public class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton Button = (JButton)e.getSource();
			if(Button.getText().equals("Play"))
				Button.setText("Stop");
			else
				Button.setText("Play");
		}
	}
*/
	public static void main(String[] args)  {
		// GUI, AWT, Swing 개념
		// Graphical User Interfasce
		// Abstract Windowing Toolkit
		// Swing 순수 자바 
		// container, component
		// JFrame, JPanel, JDialog...
		// 1. JFrame = Frame + Menu
		
		test02 MainFrame = new test02();
		
		
		
	}
}

