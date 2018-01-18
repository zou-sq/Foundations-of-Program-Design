import java.awt.*;
import javax.swing.*;

public class Framepanel {
	//-----------------------------------
	// Display some words of wisdom
	//-----------------------------------
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Framepanel");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel primary = new JPanel();
		primary.setBackground(Color.red);
		primary.setPreferredSize(new Dimension(250, 75));
		
		JLabel label1 = new JLabel("Question authority");
		JLabel label2 = new JLabel("but raise your hand first.");
		
		primary.add(label1);
		primary.add(label2);
		
		frame.getContentPane().add(primary);
		frame.pack();
		frame.setVisible(true);
	}

}
