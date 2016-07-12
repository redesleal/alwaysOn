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
	
	
	/*@org.junit.Test
	public void adicionarPedidoAmizade() {
		
		User user1 = new User();
		user1.setName("francisco");
		User user2 = new User();
		user2.setName("antonio");
		AlwaysOn alwaysOn = new AlwaysOn();
		alwaysOn.addUser(user1);
		alwaysOn.addUser(user2);
		
		
		
		userRelated.setUserIdRelated(alwaysOn.getUser(1).getId());
		userRelated.setTypeRelationShip();
		alwaysOn.getUser(1).addUserRelated(userId, TypeRelationShip.FRIENDS, measure);
		tR.setRelacionamento(tR.toString());
		tR.pedidoAmizade();
				
	}
	/*
	@org.junit.Test
	public void listarPedidosAmizade() {
		
		
		Utilizador user1 = new Utilizador();
		user1.setNome("francisco");
		Utilizador user2 = new Utilizador();
		user2.setNome("antonio");
		
		TipoRelacao tR = TipoRelacao.AMIGO;
		tR.setUtilizadorQueEnvia(user1.getNome());
		tR.setUtilizadorQueRecebe(user2.getNome());
		tR.setRelacionamento(tR.toString());
		tR.pedidoAmizade();
		
		Utilizador user3 = new Utilizador();
		user3.setNome("maria");
		Utilizador user4 = new Utilizador();
		user4.setNome("patrícia");
		
		TipoRelacao tR1 = TipoRelacao.FAMILIAR;
		tR1.setUtilizadorQueEnvia(user3.getNome());
		tR1.setUtilizadorQueRecebe(user4.getNome());
		tR1.setRelacionamento(tR1.toString());
		tR1.pedidoAmizade();
		
		TipoRelacao tr = TipoRelacao.PROFISSIONAL;
		tr.listarPedidosDeAmizade();
		
	}
	
	@org.junit.Test
	public void enviarMensagem() {
		
		Utilizador queEnvia = new Utilizador();
		queEnvia.setNome("Ana");
		Utilizador queRecebe = new Utilizador();
		queRecebe.setNome("Susana");
		
		String assunto = "Mensagem de Teste";
		String texto = "Isto é um teste...";
		
		Mensagem m1 = new Mensagem();
		m1.setUtilizadorQueEnvia(queEnvia.getNome());
		m1.setUtilizadorQueRecebe(queRecebe.getNome());
		m1.setAssuntoMensagem(assunto);
		m1.setTextoMensagem(texto);
		RedeSocial rs = new RedeSocial();
		rs.mensagens.add(m1);
		System.out.println("A mensagem foi enviada com sucesso!");
		
	}
	
	@org.junit.Test
	public void listarMensagens() {
		
		Utilizador queEnvia = new Utilizador();
		queEnvia.setNome("Ana");
		Utilizador queRecebe = new Utilizador();
		queRecebe.setNome("Susana");
		
		String assunto = "Mensagem de Teste";
		String texto = "Isto é um teste...";
		
		Mensagem m1 = new Mensagem();
		m1.setUtilizadorQueEnvia(queEnvia.getNome());
		m1.setUtilizadorQueRecebe(queRecebe.getNome());
		m1.setAssuntoMensagem(assunto);
		m1.setTextoMensagem(texto);
		RedeSocial rs = new RedeSocial();
		rs.mensagens.add(m1);
		System.out.println("A mensagem foi enviada com sucesso!");
		
		
		Utilizador queEnvia1 = new Utilizador();
		queEnvia1.setNome("Sousa Pinto");
		Utilizador queRecebe1 = new Utilizador();
		queRecebe1.setNome("Jorge Jesus");
		
		String assunto1 = "Época 2015/2016";
		String texto1 = "Águia Vitória";
		
		Mensagem m2 = new Mensagem();
		m2.setUtilizadorQueEnvia(queEnvia1.getNome());
		m2.setUtilizadorQueRecebe(queRecebe1.getNome());
		m2.setAssuntoMensagem(assunto1);
		m2.setTextoMensagem(texto1);
		RedeSocial rs1 = new RedeSocial();
		rs1.mensagens.add(m2);
		System.out.println("A mensagem foi enviada com sucesso!");
		
		RedeSocial rs2 = new RedeSocial();
		rs2.listarMensagens();
	}
	
	*/
	
	@org.junit.Test
	public void guardarDados() {
		
	}
	
	@org.junit.Test
	public void lerDados() {
		
	}
	

}
