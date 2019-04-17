package com.djxc.mySwing.myFrame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonFrame extends JFrame
{
	private JPanel buttonPanel;
	private static final int DEFALUT_WIDTH = 600;
	private static final int DEFALUT_HEIGHT = 700;

	public ButtonFrame()
	{
		setSize(DEFALUT_WIDTH, DEFALUT_HEIGHT);

		JButton yButton = new JButton("Yellow");
		JButton bButton = new JButton("Blue");
		JButton rButton = new JButton("Red");

		buttonPanel = new JPanel();
		buttonPanel.add(yButton);
		buttonPanel.add(bButton);
		buttonPanel.add(rButton);
		
		add(buttonPanel);
		ColorAction yAction = new ColorAction(Color.YELLOW);
		yButton.addActionListener(yAction);
	}
		
	private class ColorAction implements ActionListener
	{
			private Color backgroundColor;

			public ColorAction(Color c)
			{
				backgroundColor = c;
				System.out.println("new ColorAction");
			}
			
			public void actionPerformed(ActionEvent event)
			{
				buttonPanel.setBackground(backgroundColor);
			}

	}
}



