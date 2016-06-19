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
		BorderLayout layout = new BorderLayout(5,5);
		
		rootContainer.setLayout(layout);
		rootContainer.add(new JLabel("Post a comment"), BorderLayout.NORTH);
		rootContainer.add(commentLabel, BorderLayout.WEST);
		rootContainer.add(commentText, BorderLayout.EAST);
		
		rootContainer.add(cancelButton, BorderLayout.SOUTH);
		rootContainer.add(createButton, BorderLayout.SOUTH);
		
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
						commentMgr.create(
								"PostComment", 
								comment.getUser(), 
								comment.getBelief(), 
								comment.getUserComment()
						);
						
					}
				}
			);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
