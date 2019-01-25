import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;



public class HelloWorldShapeApp extends JPanel{
	
	
public HelloWorldShapeApp()
{
	setSize(new Dimension(300,200));
}
	
	public void paintComponent(Graphics page) {
		int x = 50;
		int y = 100;
		
		page.setFont(new Font("Sans-serif",Font.BOLD,30));
		
		// make blue circle
		page.setColor(Color.BLUE);
		page.fillOval(x, y, 236, 76);
		
		// make yellow circle
		page.setColor(Color.YELLOW); 
		page.fillOval(x+3, y+3, 230, 70);
		
		// Draw Hello World shadow to the screen
		page.setColor(Color.BLACK);
		page.drawString("Hello World!", x+35, y+50);
		
		// Draw Hello World to the screen
		page.setColor(Color.RED);
		page.drawString("Hello World!", x+35, y+50);
		
	}
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Hello World to Your Name");
				
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		JPanel panel = new HelloWorldShapeApp();
		panel.setPreferredSize(new Dimension(500,500));
				
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);

	}

}
