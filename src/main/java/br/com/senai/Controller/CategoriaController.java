package br.com.senai.Controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;
import br.com.senai.DAO.CategoriaDAO;
import br.com.senai.Entity.Categoria;

import javax.inject.Inject;

@Controller
@Path("/categorias")
public class CategoriaController {

    private CategoriaDAO categoriaDAO = new CategoriaDAO();

    @Inject
    private Result result;

    @Get("/")
    public void findCategoria() {
        Categoria categoria = categoriaDAO.getCategoria();
        result.use(Results.json()).withoutRoot().from(categoria).serialize();
    }
}
