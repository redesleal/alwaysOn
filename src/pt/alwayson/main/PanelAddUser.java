package pt.alwayson.main;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import pt.alwayson.model.User;

public class PanelAddUser extends JPanel {

	


	/**
	 * 
	 */
	private static final long serialVersionUID = 8028314560298783173L;

	/**
	 * Create the frame.
	 */
	public PanelAddUser() {
		
	
		setBounds(109, 11, 300, 300);
	
		
		GridBagLayout gbl_panelAddUser = new GridBagLayout();
		gbl_panelAddUser.columnWidths = new int[] { 0, 133, 0, 0 };
		gbl_panelAddUser.rowHeights = new int[] { 23, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panelAddUser.columnWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panelAddUser.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
	setLayout(gbl_panelAddUser);

		JLabel lblNewLabel = new JLabel("Nome");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		add(lblNewLabel, gbc_lblNewLabel);

		JTextField nameField = new JTextField();
		GridBagConstraints gbc_nameField = new GridBagConstraints();
		gbc_nameField.insets = new Insets(0, 0, 5, 5);
		gbc_nameField.gridx = 1;
		gbc_nameField.gridy = 1;
		add(nameField, gbc_nameField);
		nameField.setColumns(10);
		
		JLabel lblPassword = new JLabel("password");
		GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblPassword.anchor = GridBagConstraints.EAST;
		gbc_lblPassword.gridx = 0;
		gbc_lblPassword.gridy = 2;
		add(lblPassword, gbc_lblPassword);

		JPasswordField passwordField = new JPasswordField();
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.insets = new Insets(0, 0, 5, 5);
		gbc_passwordField.gridx = 1;
		gbc_passwordField.gridy = 2;
		add(passwordField, gbc_passwordField);
		passwordField.setEchoChar('P');
		passwordField.setColumns(10);
		
		JLabel lblCity = new JLabel("city");
		GridBagConstraints gbc_lblCity = new GridBagConstraints();
		gbc_lblCity.insets = new Insets(0, 0, 5, 5);
		gbc_lblCity.anchor = GridBagConstraints.EAST;
		gbc_lblCity.gridx = 0;
		gbc_lblCity.gridy = 3;
		add(lblCity, gbc_lblCity);

		JTextField cityField = new JTextField();
		GridBagConstraints gbc_cityField = new GridBagConstraints();
		gbc_cityField.insets = new Insets(0, 0, 5, 5);
		gbc_cityField.gridx = 1;
		gbc_cityField.gridy = 3;
		add(cityField, gbc_cityField);
		cityField.setColumns(10);
		
		JLabel lblCiv = new JLabel("civil state");
		GridBagConstraints gbc_lblCiv = new GridBagConstraints();
		gbc_lblCiv.insets = new Insets(0, 0, 5, 5);
		gbc_lblCiv.anchor = GridBagConstraints.EAST;
		gbc_lblCiv.gridx = 0;
		gbc_lblCiv.gridy = 4;
		add(lblCiv, gbc_lblCiv);

		JTextField civilStateField = new JTextField();
		GridBagConstraints gbc_civilStateField = new GridBagConstraints();
		gbc_civilStateField.insets = new Insets(0, 0, 5, 5);
		gbc_civilStateField.gridx = 1;
		gbc_civilStateField.gridy = 4;
		add(civilStateField, gbc_civilStateField);
		civilStateField.setColumns(10);
		
		JLabel lblNif = new JLabel("Nif");
		GridBagConstraints gbc_lblNif = new GridBagConstraints();
		gbc_lblNif.insets = new Insets(0, 0, 5, 5);
		gbc_lblNif.anchor = GridBagConstraints.EAST;
		gbc_lblNif.gridx = 0;
		gbc_lblNif.gridy = 5;
		add(lblNif, gbc_lblNif);

		JTextField nifField = new JTextField();
		GridBagConstraints gbc_nifField = new GridBagConstraints();
		gbc_nifField.insets = new Insets(0, 0, 5, 5);
		gbc_nifField.gridx = 1;
		gbc_nifField.gridy = 5;
		add(nifField, gbc_nifField);
		nifField.setColumns(10);
		
		JLabel lblEmail = new JLabel("email");
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.anchor = GridBagConstraints.EAST;
		gbc_lblEmail.gridx = 0;
		gbc_lblEmail.gridy = 6;
		add(lblEmail, gbc_lblEmail);

		JTextField emailField = new JTextField();
		GridBagConstraints gbc_emailField = new GridBagConstraints();
		gbc_emailField.insets = new Insets(0, 0, 5, 5);
		gbc_emailField.gridx = 1;
		gbc_emailField.gridy = 6;
		add(emailField, gbc_emailField);
		emailField.setColumns(10);

		JButton addUserToAlwaysOn = new JButton("addUserToAlwaysOn");
		GridBagConstraints gbc_addUserToAlwaysOn = new GridBagConstraints();
		gbc_addUserToAlwaysOn.insets = new Insets(0, 0, 0, 5);
		gbc_addUserToAlwaysOn.anchor = GridBagConstraints.NORTHWEST;
		gbc_addUserToAlwaysOn.gridx = 1;
		gbc_addUserToAlwaysOn.gridy = 8;
		add(addUserToAlwaysOn, gbc_addUserToAlwaysOn);
		addUserToAlwaysOn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User user = new User();
				user.setCity(cityField.getText());
				user.setCivilStatus(civilStateField.getText());
				user.setEmail(emailField.getText());
				user.setNif(Integer.parseInt(nifField.getText()));
				user.setPassword(passwordField.getSelectedText());
				user.setName(nameField.getText());
				Main.alwaysOn.addUser(user);
				}
		});
	}

}
