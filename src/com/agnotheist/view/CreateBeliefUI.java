/**
 * 
 */
package com.agnotheist.view;

import javax.swing.JFrame;
import com.agnotheist.model.business.manager.BeliefMgr;
import com.agnotheist.model.domain.Belief;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @author mevans
 *
 */
public class CreateBeliefUI extends JFrame implements ActionListener {

	private static final long serialVersionUID = 3444051794458232490L;

	/**
	 * UI Components seperated by grouping
	 */
	private JLabel beliefLabel = new JLabel("Belief");
	private JTextField beliefText = new JTextField(20);
	
	private JLabel statementLabel = new JLabel("Statement");
	private JTextField statementText = new JTextField(200);
	
	private JButton createButton = new JButton("Create");
	private JButton cancelButton = new JButton("Cancel");
	
	/**
	 * 
	 * @param name
	 */
	public CreateBeliefUI (String name) {
		super(name);
		
		createButton.addActionListener(
				new ActionListener () {
					public void actionPerformed (ActionEvent event) 
					{
						Belief belief = new Belief();
						belief.setReligion(beliefText.getText());
						belief.setBeliefStatement(statementText.getText());
						belief.setUser(null);
						BeliefMgr beliefMgr = new BeliefMgr();
						beliefMgr.create(
								"CreateBelief", 
								belief.getReligion(), 
								belief.getBeliefStatement(), 
								belief.getUser()
						);
						
					}
				}
			);
		
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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
