package com.djxc.mySwing.myFrame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * 添加按钮，并添加按钮事件
 * 使用匿名内部类，使代码更加简洁
 */
public class ButtonFrame extends JFrame
{
	private JPanel buttonPanel;
	private static final int DEFALUT_WIDTH = 600;
	private static final int DEFALUT_HEIGHT = 700;

	public ButtonFrame()
	{
		setSize(DEFALUT_WIDTH, DEFALUT_HEIGHT);
		buttonPanel = new JPanel();	
	
		buildButton("Yellow", Color.YELLOW);
		buildButton("Blue", Color.BLUE);
		buildButton("Red", Color.RED);
	
		add(buttonPanel);

	}
	
	public void buildButton(String title,final Color color)
	{
		JButton button = new JButton(title);
		buttonPanel.add(button);
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				buttonPanel.setBackground(color);
			}

		});

	}

}



