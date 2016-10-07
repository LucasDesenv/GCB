package br.com.senai.DAO;

import java.util.List;

import br.com.senai.Entity.Autor;

public class AutorDAO {
	private List<Autor> autors;

	public void save(Autor autor) {
		autors.add(autor);
		System.out.println(autor.getNome() + " salvo com sucesso!");
	}

	public void delete(Autor autor) {
		autors.remove(autor);
		System.out.println(autor.getNome() + " deletado com sucesso!");
	}

	public void update(Autor autor) {
		Autor autorOld = listAutor(autor);
		delete(autorOld);
		save(autor);
		System.out.println(autor.getNome() + " alterado com sucesso!");
	}

	public List<Autor> listAll() {
		return autors;
	}

	public Autor listAutor(Autor autor) {
		for (Autor autorList : autors) {
			if (autorList.equals(autor)) {
				return autor;
			}
		}
		return null;
	}
}
