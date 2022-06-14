package br.com.layouts;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Container;

public class Layouts extends JFrame {
	
	public Layouts() {
		super("New Layout");
		
		 Container c = getContentPane();
		
		c.add(BorderLayout.NORTH, new JButton ("Botão Norte"));
		c.add(BorderLayout.SOUTH, new JButton ("Botão Sul"));
		c.add(BorderLayout.CENTER, new JButton ("Botão Central"));
		c.add(BorderLayout.WEST, new JButton ("Botão Oeste"));
		c.add(BorderLayout.EAST, new JButton ("Botão Leste"));
		
		//getContentPane().add(new JButton ("Botão centralizado"));
		//getContentPane().add(new JButton ("Botão centralizado 2"));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize (300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Layouts();
	}

}
