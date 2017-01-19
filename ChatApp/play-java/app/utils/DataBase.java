package utils;

import java.util.ArrayList;
import java.util.List;

import models.Mensagem;
/**
 * Classe criada para simular o banco de dados, criada como teste antes da
 * implementacao do DAO, pode ser ignorada.
 */
public class DataBase {
	
	public List<Mensagem> getMessage(){
		List<Mensagem> mensagens = new ArrayList<>();
		mensagens.add(new Mensagem("Entrou na sala! "));
		mensagens.add(new Mensagem("Bem Vindo"));

		return mensagens;
	}
}
