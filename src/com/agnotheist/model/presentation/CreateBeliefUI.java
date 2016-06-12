/**
 * 
 */
package com.agnotheist.model.presentation;

import javax.swing.JFrame;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

/**
 * @author mevans
 *
 */
public class CreateBeliefUI extends JFrame{

//	private JLabel userLabel = new JLabel("User");
	
	private JLabel beliefLabel = new JLabel("Belief");
	private JTextField beliefText = new JTextField(20);
	
	private JLabel statementLabel = new JLabel("Statement");
	private JTextField statementText = new JTextField(200);
	
	private JButton createButton = new JButton("Create");
	private JButton cancelButton = new JButton("Cancel");
	
	public CreateUI (String name) {
		super(name);
		
		Container rootContainer = getContentPane();
		BorderLayout layout = new BorderLayout(5,5);
		
		rootContainer.setLayout(layout);
		rootContainer.add(new JLabel("Create New Belief"), BorderLayout.NORTH);
		rootContainer.add(beliefLabel, BorderLayout.WEST);
		rootContainer.add(beliefText, BorderLayout.WEST);
		
		rootContainer.add(statementLabel, BorderLayout.EAST);
		rootContainer.add(statementLabel, BorderLayout.EAST);
		
		rootContainer.add(cancelButton, BorderLayout.SOUTH);
		rootContainer.add(createButton, BorderLayout.SOUTH);
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
}
