package com_11_6;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.*;

public class DigitalWatchEx implements Runnable
{
	JFrame f;  
	Thread t=null;  
	int hours=0, minutes=0, seconds=0;  
	String timeString = "";  
	JButton b;  
	
	public DigitalWatchEx() 
	{
		
		f=new JFrame();  
		b=new JButton();  
        b.setBounds(100,100,100,50);  
      
        f.add(b);  
        f.setSize(300,400);  
        f.setLayout(null);  
        f.setVisible(true);  
        
        
	    t = new Thread(this);  
	    t.start();  
		
	}
	
	public static void main(String[] args) 
	{
		new DigitalWatchEx();
	}

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		 while (true) 
		 {  
			 	Calendar cal = Calendar.getInstance();  
	            hours = cal.get( Calendar.HOUR_OF_DAY );  
	            
	            if ( hours > 12 ) hours -= 12;  
	            
	            minutes = cal.get( Calendar.MINUTE );  
	            seconds = cal.get( Calendar.SECOND );  
	            
	            
	            SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");  
	            Date date = cal.getTime();  
	            timeString = formatter.format( date );  
	            
	            
	            printTime();  
	            try 
	            {
					t.sleep( 1000 );
				}
	            catch (InterruptedException e) 
	            {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
		 }
	}
	public void printTime()
	{  
		b.setText(timeString);  
	}  
		 
}
