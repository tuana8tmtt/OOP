package hust.soict.dsai.aims.screen;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.store.Store;
import hust.soict.dsai.aims.cart.Cart;

public class AddBookToStoreScreen extends AddItemToStoreScreen implements ActionListener  {
	
	JLabel lblTitle, lblCategory, lblCost;
	JTextField txtTitle, txtCategory, txtCost;
	JButton btnSubmit;
	
	public AddBookToStoreScreen(Store store, Cart cart) {
		super(store, cart, "Add Book");
	}
	
	@Override
	public JPanel createCenter() {
		JPanel center = new JPanel();
		center.setLayout(new GridLayout(4, 2));
		
		lblTitle = new JLabel("Enter Title:");
	    txtTitle = new JTextField();
		lblCategory = new JLabel("Enter Category:");
	    txtCategory = new JTextField();
		lblCost = new JLabel("Enter Cost:");
	    txtCost = new JTextField();
		
	    center.add(lblTitle);
	    center.add(txtTitle);
	    center.add(lblCategory);
	    center.add(txtCategory);
	    center.add(lblCost);
	    center.add(txtCost);
		
		setSize(600, 300);
		setVisible(true);
		btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(this);
		
		center.add(btnSubmit);
		return center;
	}
	
	public void actionPerformed(ActionEvent e) {
		String title = txtTitle.getText();
		String category = txtCategory.getText();
		float cost = Float.parseFloat(txtCost.getText());
		
		Book newDVD = new Book(title, category, cost);
		addItem(newDVD);
		
		txtTitle.setText("");
		txtCategory.setText("");
		txtCost.setText("");
	}
}