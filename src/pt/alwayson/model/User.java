/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package pt.alwayson.model;

import java.util.HashSet;

import pt.alwayson.model.enumTypes.TypeRelationShip;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of User.
 * 
 * @author redes
 */
public class User {
	/**
	 * Description of the property name.
	 */
	private String name = "";

	/**
	 * Description of the property id.
	 */
	private Integer id = Integer.valueOf(0);

	/**
	 * Description of the property userRelateds.
	 */
	public HashSet<UserRelated> userRelateds = new HashSet<UserRelated>();

	// Start of user code (user defined attributes for User)

	// End of user code

	/**
	 * The constructor.
	 */
	public User() {
		// Start of user code constructor for User)
		super();
		// End of user code
	}

	/**
	 * Description of the method removeUserRelated.
	 */
	public void removeUserRelated() {
		// Start of user code for method removeUserRelated
		// End of user code
	}

	/**
	 * Description of the method addUserRelated.
	 * @param userId 
	 * @param typeRelationShip 
	 * @param measure 
	 */
	public void addUserRelated(Integer userId, TypeRelationShip typeRelationShip, Integer measure) {
		// Start of user code for method addUserRelated
		// End of user code
	}

	// Start of user code (user defined methods for User)

	// End of user code
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
	 * Returns id.
	 * @return id 
	 */
	public Integer getId() {
		return this.id;
	}

	/**
	 * Sets a value to attribute id. 
	 * @param newId 
	 */
	public void setId(Integer newId) {
		this.id = newId;
	}

	/**
	 * Returns userRelateds.
	 * @return userRelateds 
	 */
	public HashSet<UserRelated> getUserRelateds() {
		return this.userRelateds;
	}

	/**
	 * Sets a value to attribute userRelateds. 
	 * @param newUserRelateds 
	 */
	public void setUserRelateds(HashSet<UserRelated> newUserRelateds) {
		this.userRelateds = newUserRelateds;
	}

}
