/**
 * 
 */
package com.agnotheist.view;

import javax.swing.JFrame;
import com.agnotheist.model.business.manager.BeliefMgr;
import com.agnotheist.model.domain.Belief;
import com.agnotheist.model.domain.User;

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
	 * UI data components separated by grouping
	 */
	// Belief label + text fields
	private JLabel beliefLabel = new JLabel("Belief");
	private JTextField beliefText = new JTextField(20);
	
	// Statement label + text fields
	private JLabel statementLabel = new JLabel("Statement");
	private JTextField statementText = new JTextField(200);
	
	//Create and cancel buttons
	private JButton createButton = new JButton("Create");
	private JButton cancelButton = new JButton("Cancel");
	
	private JButton commentButton = new JButton("Comment");
	
	private User user = new User("John", "Doe", "test@example.com", "303-333-3333", "password", "123 Main St.");
	
	/**
	 * 
	 * @param String name
	 */
	public CreateBeliefUI (String name) {
		super(name);
	}
	
	/**
	 * 
	 * @param String args
	 */
	public static void main (String[] args) {
		CreateBeliefUI cb = new CreateBeliefUI("CreateBeleif");
		cb.run();
	}
	
	/**
	 * Sets up UI and adds event listener for Create button
	 */
	public void run() {
		// creating the layout by adding components to the container
		Container rootContainer = getContentPane();
		rootContainer.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridwidth = 1;
		c.gridx = 0;
		c.gridy = 0;
		rootContainer.add(beliefLabel, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady= 20;
		c.weightx = 0.0;
		c.gridwidth = 2;
		c.gridx = 1;
		c.gridy = 1;
		rootContainer.add(beliefText, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 2.0;
		c.gridx = 0;
		c.gridy = 2;
		rootContainer.add(statementLabel, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady= 20;
		c.weightx = 0;
		c.gridwidth = 2;
		c.gridx = 1;
		c.gridy = 3;
		rootContainer.add(statementText, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 5;
		c.gridwidth = 2;
		c.gridx = 1;
		c.gridy = 4;
		rootContainer.add(createButton, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 5;
		c.gridwidth = 2;
		c.gridx = 1;
		c.gridy = 5;
		rootContainer.add(cancelButton, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 5;
		c.gridwidth = 2;
		c.gridx = 1;
		c.gridy = 6;
		rootContainer.add(commentButton, c);
		
		// Adding an action for when the create button is pressed
		createButton.addActionListener(
				new ActionListener () {
					public void actionPerformed (ActionEvent event) 
					{
						Belief belief = new Belief();
						belief.setReligion(beliefText.getText());
						belief.setBeliefStatement(statementText.getText());
						belief.setUser(user); // Need to implement create user
						BeliefMgr beliefMgr = new BeliefMgr();
						beliefMgr.performAction(
								"CreateBelief", 
								belief.getReligion(), 
								belief.getBeliefStatement(), 
								belief.getUser()
						);
						showSuccessMessage("Successfully created Belief");
					}
				}
			);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
	
	@SuppressWarnings("deprecation")
	public static void showSuccessMessage(String string) {
		MessageDialog msgDlg = new MessageDialog("Success", string);
		Utils.centerWindow(msgDlg);
		msgDlg.setModal(true);
		msgDlg.show();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
