import java.awt.event.*;
import java.awt.*;
import javax.imageio.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
import java.awt.Color.*;

class recent
{
	public recent()
	{
		JFrame f1=new JFrame();
		f1.setTitle("recent");
		f1.setSize(655,600);
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
				image=ImageIO.read(new File("tcsrussia.png"));
				image1=ImageIO.read(new File("tcslogo.png"));
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	
		public void paintComponent(Graphics g)
		{
			
			g.drawImage(image,0,0,630,350,null);
			
			g.drawImage(image1,0,0,30,30,null);
			
			Font obj=new Font("SansSerif",Font.BOLD,25);
			g.setFont(obj);
			
			g.drawString("TCS acquires multi-million Russian deal",10,385);
			
			
			Font obj1=new Font("SansSerif",Font.PLAIN,16);
			g.setFont(obj1);
			
			g.drawString("Global IT major Tata Consultancy Services(TCS) bagged a multi-million dollar contract",11,410);
			g.drawString("from Russia, the first win by any Indian company in that country.The Tata group company",11,432);
			g.drawString("has received a contract from Moscow-based National Depository Centre(NDC)and will",11,454);
			g.drawString("offer its securities product, eClearSettleTM, to the centre. Under the contract, TCS will",11,476);
			g.drawString("customise and implement its securities product that will provide depository,clearing and",11,498);
			g.drawString("settlement services to NDC.",11,520);
			
			
			Font obj3=new Font("SansSerif",Font.BOLD,16);
			g.setFont(obj3);
			
			g.drawString("TCS will set up a base in Russia and Turkey by April 1.",208,520);
			
			
			//TCS is honored to be the recipient of two SAP Pinnacle awards
			//IT Outsourcing Company of the Year category
		}
		
	}
	
	public static void main(String []args)
	{
		new recent();
	}
	
	private Image image,image1;
}