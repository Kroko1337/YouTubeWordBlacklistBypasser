package de.krokoyt.youtube.bypasser;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.UTFDataFormatException;
import java.lang.Character.UnicodeBlock;
import java.lang.Character.UnicodeScript;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main {

	
	
	
	public static void main(String[] args) {
		JFrame window = new JFrame("Youtube Comment Bypasser");
		setupContent(window);
		window.setSize(550, 200);
		window.setMinimumSize(new Dimension(550, 200));
		window.setMaximumSize(new Dimension(550, 200));
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
	
	private static void setupContent(JFrame window) {
		JPanel content = new JPanel();
		JLabel label = new JLabel("Input");
	    JButton button = new JButton("Convert"); 
	    JButton button2 = new JButton("Reverse");
	    JTextField textField = new JTextField(30);	  
	    JLabel label2 = new JLabel("Output");
	    JTextField output = new JTextField(30);
	    output.setEditable(false);
	    JButton copy = new JButton("Copy");
	    JLabel credit = new JLabel("Bypass by Goat Craft & KrokoYT");
	    content.add(label);
	    content.add(textField);
	    content.add(button);	
	    content.add(button2);
	    content.add(label2);
	    content.add(output);
	    content.add(copy);
	    
	    content.add(credit);
	    window.setContentPane(content);
	    
	    
	    button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				output.setText(umkehren(textField.getText()));
				
			}
		});
	    
	    copy.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				StringSelection selection = new StringSelection(output.getText());
				 Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
			        clipboard.setContents(selection, selection);
				
			}
		});
	    
	    button.addActionListener(new ActionListener() {
			
	    	
			@Override
			public void actionPerformed(ActionEvent e) {
//				 output.setText("‮﻿" 
//				+ umkehren(
//			    textField.getText()));
                output.setText("\u202e" +
                umkehren(
                textField.getText()));
			}
		});
	}
	
	
	
	private static String umkehren(String str) {
		String umgekehrt = new String();
		for(int j = str.length()-1;j >= 0; j--)
			umgekehrt += str.charAt(j);
		return umgekehrt;
	}
}
