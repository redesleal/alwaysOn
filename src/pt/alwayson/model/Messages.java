/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package pt.alwayson.model;

import java.io.Serializable;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Messages.
 * 
 * @author redes
 */
public class Messages implements Serializable {
	/**
	 * Description of the property userRelateds.
	 */
	
	/**
	 * Description of the property message.
	 */
	private String message = "";

	// Start of user code (user defined attributes for Messages)

	// End of user code

	/**
	 * The constructor.
	 */
	public Messages() {
		// Start of user code constructor for Messages)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Messages)

	// End of user code
	/**
	 * Returns userRelateds.
	 * @return userRelateds 
	 */
	
	/**
	 * Returns message.
	 * @return message 
	 */
	public String getMessage() {
		return this.message;
	}

	/**
	 * Sets a value to attribute message. 
	 * @param newMessage 
	 */
	public void setMessage(String newMessage) {
		this.message = newMessage;
	}

}
