import java.awt.Color;
import java.awt.Graphics;

public class Assignment1 {

	public static void main(String[] args) {
		
		 	DrawingPanel panel = new DrawingPanel(240, 170);
		 	panel.setBackground(Color.YELLOW);
	        Graphics g = panel.getGraphics();
	        
	       
	        
	        g.setColor(Color.BLUE);
	        g.fillOval(50, 25, 40, 40);
	        g.fillOval(150, 25, 40, 40);
	       
	        g.setColor(Color.RED);
	        g.fillRect(70, 45, 100, 100);
	        
	        g.setColor(Color.BLACK);
	        g.drawLine(70, 95, 170, 95);

	       
	        
	       

	}

}