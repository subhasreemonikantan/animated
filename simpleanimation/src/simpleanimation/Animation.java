package simpleanimation;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;


public  class Animation extends JPanel implements ActionListener {
	int x,y;
	Timer tm;
	
	Animation(){
		x=0;
		y=0;
		tm=new Timer(20,this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		x+=1;
		y+=1;
		repaint();
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.fillOval(x, y, 10, 10);
	}
	public static void main(String[] args) {
		JFrame jf = new JFrame("Animation");
		Animation a=new Animation();
		
		jf.setTitle("Animated");
		jf.setSize(600, 400);
		jf.add(a);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		a.tm.start();
		
	}

	
}
