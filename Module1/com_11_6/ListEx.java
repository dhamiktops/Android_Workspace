package com_11_6;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;

public class ListEx 
{
	JFrame frame;
	DefaultListModel<String>dl=new DefaultListModel<>();
	
	public ListEx() 
	{
		// TODO Auto-generated constructor stub
	
		frame=new JFrame();
		
		dl.addElement("Item1");  
		dl.addElement("Item2");  
		dl.addElement("Item3");  
		dl.addElement("Item4");  
		
		JList<String>l1 =new JList<>(dl);
		l1.setBounds(100,100, 75,75);
		
		frame.add(l1);  
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new ListEx();
	}
}
