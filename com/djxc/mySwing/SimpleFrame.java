package com.djxc.mySwing;

import java.awt.*;
import javax.swing.*;

/**
 *
 */
public class SimpleFrame
{
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				mySimpleFrame frame = new mySimpleFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
}
class mySimpleFrame extends JFrame
{
	private static final int DEFALUT_WIDTH = 300;
	private static final int DEFALUT_HEIGHT = 300;
	public mySimpleFrame()
	{
		setSize(DEFALUT_WIDTH, DEFALUT_HEIGHT);
	}
}

