import java.awt.event.*;
import java.awt.*;
import javax.imageio.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
import java.awt.Color.*;

class ceo
{
	public ceo()
	{
		JFrame f1=new JFrame();
		f1.setTitle("CEO");
		f1.setSize(400,640);
		f1.setVisible(true);
		//f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ProPanel pan=new ProPanel();
		
		f1.add(pan);
	}
	
	class ProPanel extends JPanel
	{
		public ProPanel()
		{
			
			try
			{
				image=ImageIO.read(new File("ceo.png"));
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	
		public void paintComponent(Graphics g)
		{
			
			g.drawImage(image,0,0,400,500,null);
			
			
			Font obj=new Font("SansSerif",Font.BOLD,25);
			g.setFont(obj);
			
			g.drawString("Natarajan Chandrasekaran",20,550);
			
			Font obj1=new Font("SansSerif",Font.PLAIN,24);
			g.setFont(obj1);
			
			g.drawString("Tata Consultancy Services,CEO",20,580);
		}
		
	}
	
	
	public static void main(String []args)
	{
		new ceo();
	}
	
	
	private Image image;
}	