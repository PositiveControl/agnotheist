package com.agnotheist.view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MessageDialog
    extends JDialog implements ActionListener {
  /**
	 * 
	 */
	private static final long serialVersionUID = 6236633050351127343L;
JButton okBtn = new JButton("OK");
  JLabel label = new JLabel();

  public MessageDialog(String title, String msg) {
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    setTitle(title);
    label.setText(msg);
    jbInit();
    okBtn.addActionListener(this);
  }

  private void jbInit() {
    label.setBounds(new Rectangle(56, 15, 197, 40));      
    okBtn.setBounds(new Rectangle(114, 70, 68, 23));
    this.getContentPane().add(label);
    this.getContentPane().add(okBtn);
    getContentPane().setLayout(null);
    setSize(300,150);
  }

  public void actionPerformed(ActionEvent actionEvent) {
    if (actionEvent.getSource() == okBtn) {
      dispose();
    }
  }
}