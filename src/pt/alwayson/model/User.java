/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package pt.alwayson.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import pt.alwayson.model.enumTypes.TypeRelationShip;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of User.
 * 
 * @author redes
 */
public class User implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id = Integer.valueOf(0);

	public List<UserRelated> userRelateds = new ArrayList<>();

	private String name = "";

	private String city = "";
	
	private String email = "";
	private String civilStatus = "";
	private Integer nif ;
	private String password = "";
	
	public User() {
		// Start of user code constructor for User)
		super();
		// End of user code
	}

	/**
	 * Description of the method removeUserRelated.
	 */
	public void removeUserRelated() {
	
	}

	
	public void addUserRelated(Integer userId, TypeRelationShip typeRelationShip) {
		
		
	}

	
	public Integer getId() {
		return this.id;
	}


	public void setId(Integer newId) {
		this.id = newId;
	}

	
	public List<UserRelated> getUserRelateds() {
		return this.userRelateds;
	}


	public void setUserRelateds(List<UserRelated> newUserRelateds) {
		this.userRelateds = newUserRelateds;
	}

	public String getName() {
		return this.name;
	}

	
	public void setName(String newName) {
		this.name = newName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCivilStatus() {
		return civilStatus;
	}

	public void setCivilStatus(String civilStatus) {
		this.civilStatus = civilStatus;
	}

	public Integer getNif() {
		return nif;
	}

	public void setNif(Integer nif) {
		this.nif = nif;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User ["+ id + ", userRelateds=" + userRelateds + ", name=" + name + ", city=" + city + ", email="
				+ email + ", civilStatus=" + civilStatus + ", nif=" + nif + ", password=" + password + "]";
	}

	public UserRelated getUserRelatedById(Integer userId) {
		for(UserRelated related : userRelateds)
			if(related.getUserIdRelated()==userId)
		return related;
		return null;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((civilStatus == null) ? 0 : civilStatus.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((nif == null) ? 0 : nif.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((userRelateds == null) ? 0 : userRelateds.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (civilStatus == null) {
			if (other.civilStatus != null)
				return false;
		} else if (!civilStatus.equals(other.civilStatus))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (nif == null) {
			if (other.nif != null)
				return false;
		} else if (!nif.equals(other.nif))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (userRelateds == null) {
			if (other.userRelateds != null)
				return false;
		} else if (!userRelateds.equals(other.userRelateds))
			return false;
		return true;
	}
	
	
	
	
}
