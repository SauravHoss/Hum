import javax.swing.JFrame;


public class Cob extends JFrame 
{
	public static void main(String[] args) 
	{
		JFrame app = new JFrame();
		
		Cmech c = new Cmech();
		
		LP l = new LP();
		
		app.add(l);
		
		app.add(c);
		
		//Default work
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setSize(500, 720);
		app.setVisible(true);
		//app.setResizable(false);
	}
	
}
