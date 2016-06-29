/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package pt.alwayson.model;

import java.util.HashSet;

import pt.alwayson.model.User;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of AlwaysOn.
 * 
 * @author redes
 */
public class AlwaysOn {
	/**
	 * Description of the property users.
	 */
	public HashSet<User> users = new HashSet<User>();

	/**
	 * Description of the property name.
	 */
	private String name = "";

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

	/**
	 * Description of the method addUser.
	 * @param user 
	 */
	public void addUser(User user) {
		// Start of user code for method addUser
		// End of user code
	}

	/**
	 * Description of the method removeUser.
	 */
	public void removeUser() {
		// Start of user code for method removeUser
		// End of user code
	}

	/**
	 * Description of the method getUserById.
	 * @param userId 
	 * @return 
	 */
	public User getUserById(Integer userId) {
		// Start of user code for method getUserById
		User getUserById = null;
		return getUserById;
		// End of user code
	}

	// Start of user code (user defined methods for AlwaysOn)

	// End of user code
	/**
	 * Returns users.
	 * @return users 
	 */
	public HashSet<User> getUsers() {
		return this.users;
	}

	/**
	 * Sets a value to attribute users. 
	 * @param newUsers 
	 */
	public void setUsers(HashSet<User> newUsers) {
		this.users = newUsers;
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

}
