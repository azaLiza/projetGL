import java.awt.Graphics;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;


public class Main {

	public static void main(String[] args) {
		
		Panel pl = new Panel();

		Frame f = new Frame(pl);
		
		pl.list.add(50.0);
		pl.list.add(90.0);
		pl.list.add(10.0);
		pl.list.add(210.0);
		
		
		f.repaint();
		
		for (int i = 0; i<10;i++) {
			
			f.repaint();
			
			try {
				Thread.sleep(1000);				
			} catch(Exception ignored) {
				
			}}
			
			Connectit cn= new Connectit();
			cn.tryit();
			
			ResultSet results = null;
			String requete = "SELECT * FROM person";
			
			Statement stmt = cn.createStatement();
			try {
				results = stmt.executeQuery(requete);
				System.out.println(""+results);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		
		

	}

	public static void paint(Graphics g) {
		
		g.drawString("trolol", 300, 200);
		
	}
	
}
