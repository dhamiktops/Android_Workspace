package com_11_6;

import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;

public class ChangeIconEx 
{
	public ChangeIconEx() 
	{
	
		Frame f =new Frame();
		Image icon=Toolkit.getDefaultToolkit().getImage("E:\\a.png");
		f.setIconImage(icon);    
		f.setLayout(null);     
		f.setSize(400,400);     
		f.setVisible(true);     
		
	}
	
	public static void main(String[] args) 
	{
		
		new ChangeIconEx();
		
	}
}
