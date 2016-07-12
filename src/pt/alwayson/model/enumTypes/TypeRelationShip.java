/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package pt.alwayson.model.enumTypes;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of TypeRelationShip.
 * 
 * @author redes
 */
public enum TypeRelationShip {
								/**
								 * Description of Teste.
								 */
	 PROFESSIONAL("profissional"), FAMILY("family"),  FRIENDS("friends");
	
	
	private String value;

	TypeRelationShip(String value) {
        this.setValue(value);
    }

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
		
	 @Override
	  public String toString() {
	    return value;
	  }

	// Start of user code (user defined enum literals for TypeRelationShip)

	// End of user code
}
