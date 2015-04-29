
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;

import java.awt.BorderLayout;

import javax.swing.JButton;


public class Swinglayout extends JFrame {
	private JButton button1, button2, button3, button4;
	public Swinglayout(){
		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		button4 = new JButton("4");
		setLayout(new BorderLayout());
		add(button1, BorderLayout.WEST);
		add(button2, BorderLayout.NORTH);
		add(button3, BorderLayout.SOUTH);
		add(button4, BorderLayout.EAST);
		
		setVisible (true);
		setSize(new Dimension(500,500));
		
		setLayout(new FlowLayout());
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		
		
		setVisible (true);
		setSize(new Dimension(500,500));
		
		setLayout(new GridLayout(3,2));
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		
		setVisible (true);
		setSize(new Dimension(500,500));
		
		
	}
	

}

