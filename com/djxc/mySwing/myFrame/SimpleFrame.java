package com.djxc.mySwing.myFrame;

import java.awt.*;
import javax.swing.*;
import com.djxc.mySwing.component.TxtComponent;


public class SimpleFrame extends JFrame
{
	private static final int DEFALUT_WIDTH = 300;
	private static final int DEFALUT_HEIGHT = 300;
	public SimpleFrame()
	{
		add(new TxtComponent());
		pack();
//		setSize(DEFALUT_WIDTH, DEFALUT_HEIGHT);
	}
}

