package br.com.senai.Controller;

import br.com.senai.DAO.AutorDAO;
import br.com.senai.Entity.Autor;

public class AutorController {

	private AutorDAO autorDAO = new AutorDAO();

	public void save(Autor admin) {
		autorDAO.save(admin);
	}
	
	public Autor findAutor(){
		return autorDAO.getAutor();
	}
}
