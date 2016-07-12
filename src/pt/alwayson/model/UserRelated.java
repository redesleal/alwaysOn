/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package pt.alwayson.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import pt.alwayson.model.enumTypes.TypeRelationShip;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of UserRelated.
 * 
 * @author redes
 */
public class UserRelated implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2483613987742274592L;

	/**
	 * Description of the property typeRelationShip.
	 */
	private TypeRelationShip typeRelationShip = null;

	/**
	 * Description of the property messagess.
	 */
	private List<Messages> messagess = new ArrayList<>();

	/**
	 * Description of the property userIdRelated.
	 */
	private Integer userIdRelated = Integer.valueOf(0);

	/**
	 * Description of the property users.
	 */
	
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

	/**
	 * Returns messagess.
	 * @return messagess 
	 */
	public List<Messages> getMessagess() {
		return this.messagess;
	}

	/**
	 * Sets a value to attribute messagess. 
	 * @param newMessagess 
	 */
	public void setMessagess(List<Messages> newMessagess) {
		this.messagess = newMessagess;
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

	@Override
	public String toString() {
		return "UserRelated [typeRelationShip=" + typeRelationShip + ", messagess=" + messagess + ", userIdRelated="
				+ userIdRelated + "]";
	}

	public void addMessage(Messages messages) {
		this.messagess.add(messages);
		
	}


}
