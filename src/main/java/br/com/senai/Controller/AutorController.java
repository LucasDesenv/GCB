package br.com.senai.Controller;

import java.util.List;

import br.com.senai.DAO.AutorDAO;
import br.com.senai.Entity.Autor;

public class AutorController {
	private Autor autor;
	private AutorDAO autorDAO = new AutorDAO();

	public void save(Autor autor) {
		autorDAO.save(autor);
	}

	public void delete(Autor autor) {
		autorDAO.delete(autor);
	}

	public void update(Autor autor) {
		autorDAO.update(autor);
	}

	public List<Autor> listAll() {
		return autorDAO.listAll();
	}

	public AutorController() {
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
}
