package leiandduixiang;
import java.awt.*;
import javax.swing.*;

public class NestePanels {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Nested Panels");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//set up first subpanel
		JPanel subpanel1 = new JPanel();
		subpanel1.setPreferredSize(new Dimension(150, 100));
		subpanel1.setBackground(Color.green);
		JLabel label1 = new JLabel("one");
		subpanel1.add(label1);
		
		//set up second subpanel2
		JPanel subpanel2 = new JPanel();
		subpanel2.setPreferredSize(new Dimension(150, 100));
		subpanel2.setBackground(Color.red);
		JLabel label2 = new JLabel("TWO");
		subpanel2.add(label2);
		
		//set up primary panel
		JPanel primary = new JPanel();
		primary.setBackground(Color.blue);
		primary.add(subpanel1);
		primary.add(subpanel2);
		frame.getContentPane().add(primary);
		frame.pack();
		frame.setVisible(true);
		
	}
	

}
