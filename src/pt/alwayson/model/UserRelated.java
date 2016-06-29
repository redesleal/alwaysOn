/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package pt.alwayson.model;

import java.util.HashSet;

import pt.alwayson.model.enumTypes.TypeRelationShip;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of UserRelated.
 * 
 * @author redes
 */
public class UserRelated {
	/**
	 * Description of the property users.
	 */
	public HashSet<User> users = new HashSet<User>();

	/**
	 * Description of the property userIdRelated.
	 */
	private Integer userIdRelated = Integer.valueOf(0);

	/**
	 * Description of the property typeRelationShip.
	 */
	private TypeRelationShip typeRelationShip = null;

	// Start of user code (user defined attributes for UserRelated)

	// End of user code

	/**
	 * The constructor.
	 */
	public UserRelated() {
		// Start of user code constructor for UserRelated)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for UserRelated)

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
	 * Returns userIdRelated.
	 * @return userIdRelated 
	 */
	public Integer getUserIdRelated() {
		return this.userIdRelated;
	}

	/**
	 * Sets a value to attribute userIdRelated. 
	 * @param newUserIdRelated 
	 */
	public void setUserIdRelated(Integer newUserIdRelated) {
		this.userIdRelated = newUserIdRelated;
	}

	/**
	 * Returns typeRelationShip.
	 * @return typeRelationShip 
	 */
	public TypeRelationShip getTypeRelationShip() {
		return this.typeRelationShip;
	}

	/**
	 * Sets a value to attribute typeRelationShip. 
	 * @param newTypeRelationShip 
	 */
	public void setTypeRelationShip(TypeRelationShip newTypeRelationShip) {
		this.typeRelationShip = newTypeRelationShip;
	}

}
