/**
 * 
 */
package com.agnotheist.view;

import javax.swing.JFrame;
import com.agnotheist.model.business.manager.CommentMgr;
import com.agnotheist.model.domain.Belief;
import com.agnotheist.model.domain.Comment;
import com.agnotheist.model.domain.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @author mevans
 *
 */
public class PostCommentUI extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	/**
	 * UI data components separated by grouping
	 */
	// Comment label + text fields
	private JLabel commentLabel = new JLabel("Comment");
	private JTextField commentText = new JTextField(200);
	
	//Create and cancel buttons
	private JButton createButton = new JButton("Post");
	private JButton cancelButton = new JButton("Cancel");
	
	/**
	 * 
	 * @param String name
	 */
	public PostCommentUI (String name) {
		super(name);
	}
	
	/**
	 * 
	 * @param String args
	 */
	public static void main (String[] args) {
		PostCommentUI pc = new PostCommentUI("PostComment");
		pc.run();
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
		rootContainer.add(commentLabel, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady= 20;
		c.weightx = 0.0;
		c.gridwidth = 4;
		c.gridx = 1;
		c.gridy = 1;
		rootContainer.add(commentText, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 5;
		c.gridwidth = 2;
		c.gridx = 1;
		c.gridy = 2;
		rootContainer.add(createButton, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 5;
		c.gridwidth = 2;
		c.gridx = 1;
		c.gridy = 3;
		rootContainer.add(cancelButton, c);
		
		// Adding an action for when the create button is pressed
		createButton.addActionListener(
				new ActionListener () {
					public void actionPerformed (ActionEvent event) 
					{
						Comment comment = new Comment();
						comment.setUser(new User());
						comment.setBelief(new Belief());
						comment.setUserComment(commentText.getText());
						CommentMgr commentMgr = new CommentMgr();
						commentMgr.performPostAction(
								"PostComment", 
								comment.getUser(), 
								comment.getBelief(), 
								comment.getUserComment()
						);
						
					}
				}
			);
		
		cancelButton.addActionListener(
				new ActionListener () {
					public void actionPerformed (ActionEvent event) 
					{
						setVisible(false);	
					}
				}
			);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
	
	
	public void run(String string, Belief belief) {
		// creating the layout by adding components to the container
		Container rootContainer = getContentPane();
		rootContainer.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridwidth = 1;
		c.gridx = 0;
		c.gridy = 0;
		rootContainer.add(commentLabel, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady= 20;
		c.weightx = 0.0;
		c.gridwidth = 2;
		c.gridx = 1;
		c.gridy = 1;
		rootContainer.add(commentText, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 5;
		c.gridwidth = 2;
		c.gridx = 1;
		c.gridy = 2;
		rootContainer.add(createButton, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 5;
		c.gridwidth = 2;
		c.gridx = 1;
		c.gridy = 3;
		rootContainer.add(cancelButton, c);
		
		// Adding an action for when the create button is pressed
		createButton.addActionListener(
				new ActionListener () {
					public void actionPerformed (ActionEvent event) 
					{
						Comment comment = new Comment();
						comment.setUser(belief.getUser());
						comment.setBelief(belief);
						comment.setUserComment(commentText.getText());
						CommentMgr commentMgr = new CommentMgr();
						Boolean response = commentMgr.performPostAction(
								"PostComment", 
								comment.getUser(), 
								comment.getBelief(), 
								comment.getUserComment()
						);
						
						if (response == true) { 
							System.out.println(belief);
							showSuccessMessage("Successfully created comment for " + belief.getReligion() + " belief.");
							setVisible(false);
						} else {
							showFailureMessage("Failed to create comment for " + belief.getReligion() + " belief.");
							CreateBeliefUI createBelief = new CreateBeliefUI("New Belief");
							createBelief.run();
							setVisible(false);
						}
						
					}
				}
			);
		
		cancelButton.addActionListener(
				new ActionListener () {
					public void actionPerformed (ActionEvent event) 
					{
						setVisible(false);	
					}
				}
			);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
	}
	
	@SuppressWarnings("deprecation")
	public static void showSuccessMessage(String string) {
		MessageDialog msgDlg = new MessageDialog("Success", string);
		Utils.centerWindow(msgDlg);
		msgDlg.setModal(true);
		msgDlg.show();
	}
	
	public static void showFailureMessage(String string) {
		MessageDialog msgDlg = new MessageDialog("Failure", string);
		Utils.centerWindow(msgDlg);
		msgDlg.setModal(true);
		msgDlg.show();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
