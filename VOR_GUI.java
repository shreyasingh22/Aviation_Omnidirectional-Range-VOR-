import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class VOR_GUI extends JFrame
{
	private ImageIcon image;
	
	public VOR_GUI()
	{
		setTitle("VOR_GUI");
		setSize(480,480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		getContentPane().setLayout(null);
		
		
		
	JButton btnNewButton = new JButton(new ImageIcon("Images/obs1.gif"));
	JButton btn1NewButton = new JButton(new ImageIcon("Images/up1.gif"));
	JButton btn2NewButton = new JButton(new ImageIcon("Images/down1.gif"));
		//btnNewButton.setSize(20,20);
		//btnNewButton.addActionListener(new ActionListener() 
		//{
			//public void actionPerformed(ActionEvent arg0) {
			//}
		//});
		
		getContentPane().add(btnNewButton);
		btnNewButton.setBounds(310,200, 30,30);
		getContentPane().add(btn1NewButton);
		btn1NewButton.setBounds(418,275,43,50);
		getContentPane().add(btn2NewButton);
		btn2NewButton.setBounds(418,325,43,50);
		
		
		JLabel lblNewLabel = new JLabel();
		getContentPane().add(lblNewLabel);
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBounds(410,150,10,10);
		
		
		
	}
	public void paint(Graphics g)
	{
		g.drawLine(300, 0, 300, 480);
		g.setColor(Color.BLACK);
		g.drawLine(300, 270, 480, 270);
		g.setColor(Color.BLACK);
	    g.drawOval(315,100,140,140);
	    g.drawOval(332,117,108,108);
	    g.drawLine( 332,170,440,170);
	    g.drawRect(315,300,150,100);
	    g.drawLine(420,300,420,400);
	    g.drawLine(420,350,465,350);
	   g.drawLine(150,140,150,340);
	   g.drawLine(50,240,250,240);
	   g.drawRect(345,155,10,10);
	   g.drawRect(345,175,10,10);
	   g.drawLine(350,168,350,172);
	   g.drawLine(360,168,360,172);
	   g.drawLine(370,168,370,172); 
	   g.drawLine(380,168,380,172);
	   g.drawLine(390,168,390,172);
	   g.drawLine(400,168,400,172);
	   g.drawLine(410,168,410,172);
	   g.drawLine(420,168,420,172);
	  
	}
	public static void main(String[] args)
	{
		VOR_GUI t = new VOR_GUI();
		
	}
}



