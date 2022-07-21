package com_11_6;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;


class MyCanvas extends Canvas
{
	@Override
	public void paint(Graphics g) 
	{
		// TODO Auto-generated method stub
		//super.paint(g);
		Toolkit t=Toolkit.getDefaultToolkit();  
        Image i=t.getImage("E://a.png");  
        g.drawImage(i, 120,100,this);  
	}
}

public class DisplayImageEx 
{
	
	public static void main(String[] args) 
	{
		MyCanvas canvas =new MyCanvas();
		JFrame frame=new JFrame();
		frame.add(canvas);
		frame.setSize(400,400);  
		frame.setVisible(true);  
	}
}
