package com_11_6;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuEx 
{
	
	JFrame frame;
	JMenu menu,submenu;
	JMenuBar menuBar;
	JMenuItem i1,i2,i3,i4,i5;
	
	public MenuEx() 
	{
		// TODO Auto-generated constructor stub
		
		frame=new JFrame();
		menuBar=new JMenuBar();
		menu=new JMenu("File");
		submenu=new JMenu("Submenu");
		
		i1=new JMenuItem("Create");
		i2=new JMenuItem("New");
		i3=new JMenuItem("About");
		i4=new JMenuItem("Contact");
		i5=new JMenuItem("City");
		
		
		menu.add(i1);
		menu.add(i2);
		menu.add(i3);
		menu.add(submenu);
		submenu.add(i4);
		submenu.add(i5);
		/*menu.add(i4);
		menu.add(i5);*/
		
		menuBar.add(menu);
		
		frame.setJMenuBar(menuBar);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	
	public static void main(String[] args) 
	{
		
		new MenuEx();
		
	}
}
