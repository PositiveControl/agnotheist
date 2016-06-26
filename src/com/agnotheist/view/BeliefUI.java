package com.agnotheist.view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JTextPane;

public class BeliefUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -398995170938611745L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BeliefUI frame = new BeliefUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BeliefUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCreateNewBelief = new JButton("Create New Belief");
		btnCreateNewBelief.setBounds(124, 226, 180, 29);
		contentPane.add(btnCreateNewBelief);
		
		JTextPane txtpnWelcomeToAgnotheist = new JTextPane();
		txtpnWelcomeToAgnotheist.setText("Welcome to Agnotheist, to get started, click Create New Belief");
		txtpnWelcomeToAgnotheist.setBounds(124, 101, 202, 56);
		contentPane.add(txtpnWelcomeToAgnotheist);
		
		
		btnCreateNewBelief.addActionListener(
				new ActionListener () {
					public void actionPerformed (ActionEvent event) 
					{
						CreateBeliefUI createBelief = new CreateBeliefUI("New Belief");
						createBelief.run();
					}
				}
			);
	}
}
