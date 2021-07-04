import java.awt.event.*;
import java.awt.*;
import javax.imageio.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
import java.awt.Color.*;
import java.awt.geom.*;

class profile
{
	public profile()
	{
		JFrame f1=new JFrame();
		f1.setTitle("Profile");
		f1.setSize(700,640);
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
				image=ImageIO.read(new File("back.png"));
				
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	
		public void paintComponent(Graphics g)
		{
			
			g.drawImage(image,0,0,700,640,null);
			
		
			
			Font obj=new Font("SansSerif",Font.BOLD,25);
			g.setFont(obj);
			
			g.drawString("TCS Company Profile",230,50);
			
			g.drawString("Vision:",11,160);
			
			g.drawString("Mission:",11,220);
			
			g.drawString("Values:",430,180);
			
			g.drawString("Company info:",11,346);
			
			g.drawString("Achievements:",11,430);
			
			Font obj1=new Font("SansSerif",Font.PLAIN,16);
			g.setFont(obj1);
			                                    //intro
			g.drawString("Tata Consultancy Services is an IT services, business solutions and outsourcing organization that",11,100);
			g.drawString("delivers real results to global businesses, ensuring a level of certainty that no other firm can match.",11,122);
			
			// vision
			g.drawString("To be the best partner",11,189);
			
			//mission
			g.drawString("-To help customers achieve their business objectives",11,249);
			g.drawString("by providing innovative, best-in-class consulting, IT",15,271);
			g.drawString("solutions and services.",15,293);
			g.drawString("-To make it a joy for all stakeholders to work with us.",11,315);
			
			
			//company info
			g.drawString("TCS has over 238,583 of the world's best-trained",11,375);
			g.drawString("IT consultants in 42 countries.Revenue of $10.17 billion.",11,397); 
			
			//achivements
			
			g.drawString("-TCS is the second-largest employer after Coal",11,455);
			g.drawString("India Limited.",12,477);
			g.drawString("-It bagged the country's first software project,the Inter-Branch Reconciliation System (IBRS)",12,499);
			g.drawString("for the Central Bank of India.",12,521);
			
			
			
			Font obj3=new Font("SansSerif",Font.BOLD,16);
			g.setFont(obj3);
			
			
			Graphics2D g2=(Graphics2D) g;  //rectangle
			
			Rectangle2D rect=new Rectangle2D.Double(400,200,270,260);
			g2.draw(rect);
			
			Font obj4=new Font("SansSerif",Font.BOLD,20);
			g.setFont(obj4); 
			
			// values
		
			g.drawString("Leading change",420,249);
			g.drawString("Integrity",420,279);
			g.drawString("Respect for the individual",420,309);
			g.drawString("Excellence",420,339);
			g.drawString("Learning and Sharing",420,369);
		}
	
	}	
	
	
	
	public static void main(String []args)
	{
		new profile();
	}
	
	private Image image;
}