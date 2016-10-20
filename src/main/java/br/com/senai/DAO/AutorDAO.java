package br.com.senai.DAO;

import br.com.senai.Entity.Autor;
import br.com.senai.util.MessageUtil;

public class AutorDAO {

	static Autor autor;

	public void save(Autor autor) {
		if (AutorDAO.autor != null){
			throw new IllegalArgumentException(MessageUtil.getMessage("msg.warn.ja.existe.um.autor.cadastrado"));
		}
		AutorDAO.autor = autor;
		UsuarioDAO.addUsuario(autor.getUsuario());
		System.out.println(AutorDAO.autor.getNome() + " salvo com sucesso!");
	}

	public Autor getAutor() {
		return autor;
	}
	
}
