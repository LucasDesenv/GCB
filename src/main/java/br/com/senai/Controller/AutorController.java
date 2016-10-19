package br.com.senai.Controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;
import br.com.senai.DAO.AutorDAO;
import br.com.senai.Entity.Autor;

@Path("/autor")
@Controller
public class AutorController {
    private AutorDAO autorDAO = new AutorDAO();

    @Inject
    private Result result;

	public void save(Autor admin) {
		autorDAO.save(admin);
	}

    @Get("/")
    public void findAutor() {
        Autor autor = autorDAO.getAutor();
        result.use(Results.json()).withoutRoot().from(autor).include("usuario").serialize();
    }
}
