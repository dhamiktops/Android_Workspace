package com_11_6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class NotepadEx implements ActionListener
{
	JFrame frame;
	JMenuBar menuBar;
	JMenu menu1,menu2,menu3;
	JMenuItem cut,copy,paste,selectall,newitem,openitem,closeitem;
	JTextArea textarea;
	
	
	public NotepadEx() 
	{
		
		frame=new JFrame();
		
		menuBar=new JMenuBar();
		
		menu1=new JMenu("Edit");
		menu2=new JMenu("File");
		menu3=new JMenu("Help");
		
		
		cut=new JMenuItem("Cut");
		copy=new JMenuItem("Copy");
		paste=new JMenuItem("Paste");
		selectall=new JMenuItem("Select All");
		newitem=new JMenuItem("New");
		openitem=new JMenuItem("Open");
		closeitem=new JMenuItem("Close");
		
		
		textarea=new JTextArea();
		textarea.setBounds(100, 100, 100, 100);
		menu1.add(cut);
		menu1.add(copy);
		menu1.add(paste);
		menu1.add(selectall);
		menu2.add(newitem);
		menu2.add(openitem);
		menu2.add(closeitem);
		
		
		menuBar.add(menu1);

		menuBar.add(menu2);

		menuBar.add(menu3);

		frame.setJMenuBar(menuBar);
		frame.add(textarea);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
		cut.addActionListener(this);
		copy.addActionListener(this);
		paste.addActionListener(this);
		selectall.addActionListener(this);
		
	}
	
	public static void main(String[] args)
	{
		new NotepadEx();
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		if(e.getSource()==cut)
		{
			textarea.cut();
		}
		if(e.getSource()==copy)
		{
			textarea.copy();
		}
		if(e.getSource()==paste)
		{
			textarea.paste();
		}
		if(e.getSource()==selectall)
		{
			textarea.selectAll();
		}
	}
}
