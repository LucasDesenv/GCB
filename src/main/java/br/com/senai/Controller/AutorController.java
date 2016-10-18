package br.com.senai.Controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.senai.DAO.AutorDAO;
import br.com.senai.Entity.Autor;

@Path("/autor")
@Controller
public class AutorController {

	private AutorDAO autorDAO = new AutorDAO();

	public void save(Autor admin) {
		autorDAO.save(admin);
	}

	@Path("/")
	public Autor findAutor(){
		return autorDAO.getAutor();
	}
}
