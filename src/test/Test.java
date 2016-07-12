package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import junit.framework.Assert;
import pt.alwayson.model.AlwaysOn;
import pt.alwayson.model.User;
import pt.alwayson.model.UserRelated;
import pt.alwayson.model.enumTypes.TypeRelationShip;

public class Test {


	
	
	@org.junit.Test
	public void addUser() {
			
		User user = new User();
		user.setName("faba");
		user.setCity("Coimbra");
		user.setCivilStatus("Single");
		user.setNif(23425);
		user.setEmail("faba@fila.pt");
		user.setPassword("123");
		AlwaysOn alwaysOn = new AlwaysOn();
		alwaysOn.addUser(user);		
		assertEquals(alwaysOn.getUsers().get(0), user);
	}
	
	@org.junit.Test
	public void listUsers() {
		
		User user = new User();
		user.setName("323423");
		user.setCity("Coimbra");
		user.setCivilStatus("Single");
		user.setNif(23425);
		user.setEmail("faba@fila.pt");
		user.setPassword("123");
		
		
		User user2 = new User();
		user.setName("fabaaaaa");
		user.setCity("Coimbra");
		user.setCivilStatus("Single");
		user.setNif(23425);
		user.setEmail("faba@fila.pt");
		user.setPassword("123");
		
		AlwaysOn alwaysOn = new AlwaysOn();
		alwaysOn.addUser(user);
		alwaysOn.addUser(user2);	
		
		alwaysOn.listUsers();
		
	}
	
	
	@org.junit.Test
	public void removeUser() {
		
		User user = new User();
		user.setName("faba");
		user.setCity("Coimbra");
		user.setCivilStatus("Single");
		user.setNif(33333);
		user.setEmail("faba@fila.pt");
		user.setPassword("123");
		
		AlwaysOn alwaysOn = new AlwaysOn();
		alwaysOn.addUser(user);
		alwaysOn.removeUser("faba");
	
		assertTrue(alwaysOn.getUsers().isEmpty());
		
	}
	
	
	

}
