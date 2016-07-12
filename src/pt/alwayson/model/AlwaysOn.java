/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package pt.alwayson.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import pt.alwayson.main.Main;
import pt.alwayson.model.User;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of AlwaysOn.
 * 
 * @author redes
 */
public class AlwaysOn implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Description of the property users.
	 */
	/**
	 * Description of the property name.
	 */
	private String name = "";

	/**
	 * Description of the property users.
	 */
	private List<User> users = new ArrayList<>();

	// Start of user code (user defined attributes for AlwaysOn)

	// End of user code

	/**
	 * The constructor.
	 */
	public AlwaysOn() {
		// Start of user code constructor for AlwaysOn)
		super();
		// End of user code
	}

	public AlwaysOn(String string) {
		this.name=string;
	}

	/**
	 * Description of the method addUser.
	 * @param user 
	 */
	public void addUser(User user) {
		try {
			user.setId(users.get(Main.alwaysOn.getUsers().size() - 1).getId() + 1);
		} catch (Exception e1) {
			user.setId(1);

		}
		this.users.add(user);
	}

	/**
	 * Description of the method removeUser.
	 * @param i 
	 */
	public void removeUser(String i) {
		for(User user : this.users)
			if(user.getName().equals(i))
			{ this.users.remove(user);
			return;
			}
	}

	/**
	 * Description of the method getUserById.
	 * @param userId 
	 * @return 
	 */
	public User getUserById(Integer userId) {
		// Start of user code for method getUserById
		for(User user : this.users)
		if(user.getId()== userId)
		return user;
		
		return null;
		// End of user code
	}

	// Start of user code (user defined methods for AlwaysOn)

	// End of user code
	/**
	 * Returns users.
	 * @return users 
	 */
	public User getUser(Integer position) {
		return this.users.get(position);
	}

	/**
	 * Sets a value to attribute users. 
	 * @param newUsers 
	 */
	public void setUser(User newUsers) {
		this.users.add(newUsers);
	}

	/**
	 * Returns name.
	 * @return name 
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Sets a value to attribute name. 
	 * @param newName 
	 */
	public void setName(String newName) {
		this.name = newName;
	}

	/**
	 * Returns users.
	 * @return users 
	 */
	public List<User> getUsers() {
		return this.users;
	}

	/**
	 * Sets a value to attribute users. 
	 * @param newUsers 
	 */
	public void setUsers(List<User> newUsers) {
		this.users = newUsers;
	}

	public StringBuilder listUsers() {
		StringBuilder x= new StringBuilder();

		for (User user :  users) {

			x.append(user.toString() + "\n");
			System.out.println(user.toString());
		}
		return x;
		// TODO Auto-generated method stub
		
	}

}
