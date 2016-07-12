package pt.alwayson.main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

import pt.alwayson.model.AlwaysOn;
import pt.alwayson.model.Messages;
import pt.alwayson.model.User;
import pt.alwayson.model.UserRelated;
import pt.alwayson.model.enumTypes.TypeRelationShip;

import javax.swing.JPanel;

import java.awt.Color;

import javax.swing.JTextArea;
import java.awt.SystemColor;
import javax.swing.JComboBox;
import java.awt.event.ItemListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.awt.event.ItemEvent;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class Main {

	private JFrame frame;

	private PanelAddUser panelAddUser = new PanelAddUser();
	private PanelListUser panelListUser = new PanelListUser();
	public static AlwaysOn alwaysOn = new AlwaysOn("AlwaysOn");
	private JComboBox<String> cbRelated1;
	private JComboBox<String> cbRelated2;
	private JComboBox<String> comboBox_2;
	private JPanel panel_1;
	private JTextField textField;
	private JButton btnFindUser;
	private JComboBox<String> comboBox_3;
	private JTextArea lblUserRelated;
	private JButton btnDelete;
	private JButton btnSaveToFile;
	private JButton btnOpenFile;
	private JPanel panel_2;
	private JComboBox<String> cbFrom;
	private JComboBox<String> comboBox_5;
	private JButton btnRemoveRelation;
	private JPanel panelSendMessage;
	private JComboBox<String> cbSendFrom;
	private JComboBox<String> cbReceive;
	private JButton btnSendMessage;
	private JTextField txtFieldSendMessage;
	private JButton btnNewButton;

	private JPanel panelAddRelation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {

		initialize();

		frame.getContentPane().add(panelAddUser);
		frame.getContentPane().add(panelListUser);
		frame.getContentPane().add(panelAddRelation);

		btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				cbSendFrom.removeAllItems();
				for (User user : alwaysOn.getUsers())
					cbSendFrom.addItem(user.getName());

				cbReceive.removeAllItems();
				for (User user : alwaysOn.getUsers())
					cbReceive.addItem(user.getName());
			}

		});
		btnNewButton.setBounds(10, 146, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1167, 655);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnAddUser = new JButton("add User");
		btnAddUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.getContentPane().add(panelAddUser);
				frame.getContentPane().remove(panelListUser);
				frame.getContentPane().remove(panelAddRelation);
				frame.getContentPane().repaint();

			}
		});
		btnAddUser.setBounds(10, 31, 89, 23);
		frame.getContentPane().add(btnAddUser);

		JButton btnListUser = new JButton("List User");
		btnListUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JTextArea textAreaLisUsers = new JTextArea();
				textAreaLisUsers.setBackground(SystemColor.activeCaption);
				textAreaLisUsers.setBounds(0, 0, 300, 300);

				textAreaLisUsers.append(alwaysOn.listUsers().toString());

				panelListUser.removeAll();
				panelListUser.add(textAreaLisUsers);
				panelListUser.repaint();
				frame.getContentPane().remove(panelAddUser);
				frame.getContentPane().remove(panelAddRelation);
				frame.getContentPane().add(panelListUser);
				frame.getContentPane().repaint();

			}
		});
		btnListUser.setBounds(10, 78, 89, 23);
		frame.getContentPane().add(btnListUser);

		JButton btnConnectUsers = new JButton("connectUsers");
		btnConnectUsers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.getContentPane().remove(panelAddUser);
				frame.getContentPane().remove(panelListUser);
				frame.getContentPane().add(panelAddRelation);
				frame.getContentPane().repaint();
				cbRelated1.removeAllItems();
				for (User user : alwaysOn.getUsers())
					cbRelated1.addItem(user.getName());
				cbRelated2.removeAllItems();
				for (User user : alwaysOn.getUsers())
					cbRelated2.addItem(user.getName());
			}
		});
		btnConnectUsers.setBounds(10, 112, 89, 23);
		frame.getContentPane().add(btnConnectUsers);

		panelAddRelation = new JPanel();
		panelAddRelation.setBounds(109, 11, 300, 300);

		panelAddRelation.setLayout(null);

		cbRelated1 = new JComboBox<String>();
		cbRelated1.setBounds(32, 5, 133, 33);
		for (User user : alwaysOn.getUsers())
			cbRelated1.addItem(user.getName());
		panelAddRelation.add(cbRelated1);

		cbRelated2 = new JComboBox<String>();
		cbRelated2.setBounds(32, 49, 133, 33);
		panelAddRelation.add(cbRelated2);

		JButton btnaddRelation = new JButton("add Relation");
		btnaddRelation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int id1 = cbRelated1.getSelectedIndex();
				int id2 = cbRelated2.getSelectedIndex();
				System.out.println(id1 + " " + id2);
				UserRelated userRelated = new UserRelated();
				userRelated.setTypeRelationShip(TypeRelationShip.values()[(comboBox_2.getSelectedIndex())]);
				userRelated.setUserIdRelated(alwaysOn.getUsers().get(id2).getId());
				alwaysOn.getUsers().get(id1).userRelateds.add(userRelated);

				UserRelated userRelated2 = new UserRelated();
				userRelated2.setTypeRelationShip(TypeRelationShip.values()[(comboBox_2.getSelectedIndex())]);
				userRelated2.setUserIdRelated(alwaysOn.getUsers().get(id1).getId());
				alwaysOn.getUsers().get(id2).userRelateds.add(userRelated2);

			}
		});
		btnaddRelation.setBounds(92, 143, 145, 23);
		panelAddRelation.add(btnaddRelation);

		comboBox_2 = new JComboBox(TypeRelationShip.values());
		comboBox_2.setBounds(32, 105, 125, 23);
		panelAddRelation.add(comboBox_2);

		panel_1 = new JPanel();
		panel_1.setBounds(419, 11, 300, 300);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		textField = new JTextField();
		textField.setBounds(84, 6, 86, 20);
		panel_1.add(textField);
		textField.setColumns(10);

		btnFindUser = new JButton("find");
		btnFindUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// textField
				comboBox_3.removeAllItems();
				for (User user : alwaysOn.getUsers())
					if (user.getName().contains(textField.getText()) || user.getNif().equals(Integer.parseInt(textField.getText())))
						comboBox_3.addItem(user.getName());
			}
		});
		btnFindUser.setBounds(84, 31, 89, 23);
		panel_1.add(btnFindUser);

		comboBox_3 = new JComboBox<String>();

		comboBox_3.addActionListener(new ActionListener() {
			private User userPrincipal;

			public void actionPerformed(ActionEvent e) {
				System.out.println(e.getActionCommand() + " " + comboBox_3.getItemCount());
				if (comboBox_3.getItemCount() > 0) {
					lblUserRelated.setText(null);
					lblUserRelated.append("Related Users\n");
					userPrincipal = null;
					for (User user : alwaysOn.getUsers()) {
						if (user.getName().equals(comboBox_3.getSelectedItem())) {
							System.out.println("teste");
							userPrincipal = user;

						}
					}

					for (UserRelated related : userPrincipal.userRelateds) {
						System.out.println("teste");
						for (User user : alwaysOn.getUsers())
							if (related.getUserIdRelated() == user.getId()) {

								System.out.println("teste");
								lblUserRelated.append(user.getName() + "\n");
								lblUserRelated.append("messages\n");
								for (Messages messages : related.getMessagess()) {
									lblUserRelated.append(messages.getMessage() + "\n");
								}

							}
					}
				}
			}
		});
		comboBox_3.setBounds(36, 88, 183, 20);
		panel_1.add(comboBox_3);

		btnDelete = new JButton("delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (comboBox_3.getItemCount() > 0) {
					lblUserRelated.setText(null);
					lblUserRelated.append("Related Users\n");

					alwaysOn.removeUser(comboBox_3.getSelectedItem().toString());
				}
			}

		});
		btnDelete.setBounds(69, 153, 89, 23);
		panel_1.add(btnDelete);

		lblUserRelated = new JTextArea();
		lblUserRelated.setBackground(SystemColor.activeCaption);
		lblUserRelated.setBounds(729, 11, 300, 300);
		frame.getContentPane().add(lblUserRelated);

		btnSaveToFile = new JButton("saveToFile");
		btnSaveToFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {

					FileOutputStream fout = new FileOutputStream("c:\\test\\address.ser");
					ObjectOutputStream oos = new ObjectOutputStream(fout);
					oos.writeObject(alwaysOn);
					oos.close();
					System.out.println("Done");

				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		btnSaveToFile.setBounds(10, 203, 89, 23);
		frame.getContentPane().add(btnSaveToFile);

		btnOpenFile = new JButton("Open File");
		btnOpenFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {

					FileInputStream fin = new FileInputStream("c:\\test\\address.ser");
					ObjectInputStream ois = new ObjectInputStream(fin);
					alwaysOn = (AlwaysOn) ois.readObject();
					ois.close();

				} catch (Exception ex) {
					ex.printStackTrace();

				}
			}
		});
		btnOpenFile.setBounds(10, 237, 89, 23);
		frame.getContentPane().add(btnOpenFile);

		panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(429, 322, 304, 273);
		frame.getContentPane().add(panel_2);

		cbFrom = new JComboBox<String>();
		cbFrom.setBounds(161, 5, 133, 33);
		panel_2.add(cbFrom);

		comboBox_5 = new JComboBox<String>();
		comboBox_5.setBounds(161, 49, 133, 33);
		panel_2.add(comboBox_5);

		btnRemoveRelation = new JButton("Remove Relation");
		btnRemoveRelation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRemoveRelation.setBounds(185, 111, 89, 23);
		panel_2.add(btnRemoveRelation);

		panelSendMessage = new JPanel();
		panelSendMessage.setLayout(null);
		panelSendMessage.setBounds(105, 332, 304, 273);
		frame.getContentPane().add(panelSendMessage);

		cbSendFrom = new JComboBox<String>();
		cbSendFrom.setBounds(161, 5, 133, 33);
		panelSendMessage.add(cbSendFrom);

		cbReceive = new JComboBox<String>();
		cbReceive.setBounds(161, 49, 133, 33);
		panelSendMessage.add(cbReceive);

		btnSendMessage = new JButton("SendMessage");
		btnSendMessage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id1 = cbRelated1.getSelectedIndex();
				int id2 = cbRelated2.getSelectedIndex();

				UserRelated userRelated = alwaysOn.getUsers().get(id2)
						.getUserRelatedById(alwaysOn.getUsers().get(id1).getId());
				Messages messages = new Messages();
				messages.setMessage(txtFieldSendMessage.getText());
				userRelated.addMessage(messages);
			}
		});
		btnSendMessage.setBounds(33, 191, 105, 23);
		panelSendMessage.add(btnSendMessage);

		txtFieldSendMessage = new JTextField();
		txtFieldSendMessage.setColumns(10);
		txtFieldSendMessage.setBounds(10, 31, 105, 51);
		panelSendMessage.add(txtFieldSendMessage);
	}
}
