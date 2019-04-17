package com.djxc.mySwing;

import java.awt.*;
import javax.swing.*;
import com.djxc.mySwing.myFrame.ButtonFrame;
import com.djxc.mySwing.myFrame.SimpleFrame;

/**
 * @author djxc
 * @version 1.0
 * It's a demo for show frame.
 */
public class myWindow 
{
	public void showWindow(String title)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				//JFrame frame = new SimpleFrame();
				JFrame frame = new ButtonFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setTitle(title);
				frame.setVisible(true);
			}
		});

	}
}

