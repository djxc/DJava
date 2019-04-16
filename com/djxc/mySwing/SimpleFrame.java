package com.djxc.mySwing;

import java.awt.*;
import javax.swing.*;
import com.djxc.mySwing.component.TxtComponent;

/**
 * @author djxc
 * @version 1.0
 * It's a demo for show frame.
 */
public class SimpleFrame
{
	public void showFrame(String title)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				JFrame frame = new mySimpleFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setTitle(title);
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
		add(new TxtComponent());
		pack();
//		setSize(DEFALUT_WIDTH, DEFALUT_HEIGHT);
	}
}
