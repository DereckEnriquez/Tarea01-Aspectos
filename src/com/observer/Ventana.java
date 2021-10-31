package com.observer;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Ventana extends JFrame {
	
	private final JButton boton1 = new JButton("Azul");
	private final JButton boton2 = new JButton("Cyan");
	private final JButton boton3 = new JButton("Verde");
	
	public Ventana() {
		// TODO Auto-generated constructor stub
		setTitle("Prueba");
		setSize(310,100);
		setLocation(250,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container FondoPanel = getContentPane();
		SpringLayout layout = new SpringLayout();
		FondoPanel.setLayout(layout);
		
		layout.putConstraint(SpringLayout.WEST, boton1, 10, SpringLayout.WEST, FondoPanel);
		layout.putConstraint(SpringLayout.NORTH, boton1, 20, SpringLayout.NORTH, FondoPanel);
		
		layout.putConstraint(SpringLayout.WEST, boton2, 110, SpringLayout.WEST, FondoPanel);
		layout.putConstraint(SpringLayout.NORTH, boton2, 20, SpringLayout.NORTH, FondoPanel);
		
		layout.putConstraint(SpringLayout.WEST, boton3, 210, SpringLayout.WEST, FondoPanel);
		layout.putConstraint(SpringLayout.NORTH, boton3, 20, SpringLayout.NORTH, FondoPanel);

	    boton1.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent evento) {
				ChangeColor(FondoPanel, boton1.getText());
			}
		});
		
		boton2.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent evento){
				ChangeColor(FondoPanel, boton2.getText());
			}
		});
		
		boton3.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent evento){
				ChangeColor(FondoPanel , boton3.getText());
			}
		});
		
		FondoPanel.add(boton1);
		FondoPanel.add(boton2);
		FondoPanel.add(boton3);
	
	}
	
	public static void ChangeColor(Container c, String color){
		switch(color) {
		case "Azul":
			c.setBackground(Color.BLUE);
			break;
		case "Cyan":
			c.setBackground(Color.CYAN);
			break;
		case "Verde":
			c.setBackground(Color.GREEN);
			break;
		}
		
		System.out.printf("Cambio a color %s\n",color); 
	}
}
