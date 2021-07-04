import javax.swing.*;
import java.io.*;
import java.util.*;
import java.awt.event.*;
import java.awt.*;
import javax.imageio.*;

class mainframe implements ActionListener 
{
	
	public mainframe()
	{
		JFrame f=new JFrame();			// frame created
		f.setTitle("TCS");
		f.setSize(530,590);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ProgramPanel p=new ProgramPanel(); //  image panel
		
		JPanel b=new JPanel();	// button panel
		
		ceo=new JButton("ceo");
		prof=new JButton("profile");
		recent=new JButton("Recent Activites");
		
		b.add(ceo);   					// add button to panel
		b.add(prof);
		b.add(recent);
		
		
		ceo.addActionListener(this);
		prof.addActionListener(this);
		recent.addActionListener(this);
		
		f.add(p);						//add image panel to frame
		f.add(b,BorderLayout.SOUTH);		// add button panel to frame
		
	
	}
	
	public void actionPerformed(ActionEvent event)
	{
		Object source=event.getSource();
		if(source==ceo)
		{
			new ceo();
		}
		else if(source==prof)
		{
			 new profile();
		}
		else if(source==recent)
		{
			new recent();
		}
	}			

	class ProgramPanel extends JPanel
	{
		public ProgramPanel()
		{
			
			try
			{
				image=ImageIO.read(new File("tcs.png"));
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	
		public void paintComponent(Graphics g)
		{
			
			g.drawImage(image,0,0,500,500,null);
			
		}
		
	}
		
	public static void main(String args[])
	{
		new mainframe();
	}
	private Image image;
	private JButton ceo,prof,recent;
}

	
	
	
	
	
