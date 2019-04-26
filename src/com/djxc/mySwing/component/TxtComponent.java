package com.djxc.mySwing.component;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class TxtComponent extends JComponent
{
	public static final int MESSAGE_X = 75;
	public static final int MESSAGE_Y = 95;

	public static final int DEFAULT_WIDTH = 300;
	public static final int DEFAULT_HEIGHT = 200;

	public void paintComponent(Graphics g)
	{
		System.out.println("component");
		g.drawString("djxc home", MESSAGE_X, MESSAGE_Y);
		Graphics2D g2 = (Graphics2D) g;
		Rectangle2D rect = new Rectangle2D.Double(20, 30, 50, 50);
		g2.draw(rect);
	}
	public Dimension getPreferredSize()
	{
		return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
	}
}
