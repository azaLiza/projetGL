import java.awt.Color;
import java.awt.Graphics;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Panel extends JPanel{
	
	public ArrayList<Double> list= new ArrayList<>();
	
	public void paintComponent(Graphics g) {
		
		Main.paint(g);
		
		
		
		
		int c = 0;
		double current = 0;
		for (double d : list) {
			
			g.setColor(new Color(c*50,255-c*25,0));
			
			g.fillArc(200, 100, 400, 400, (int) current, (int)d);//x,y,largeur,longueur,debut,arc en degres
			
			current += d;
			c++;
		}
		
	}

}
