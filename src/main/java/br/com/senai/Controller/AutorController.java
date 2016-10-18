package br.com.senai.Controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;
import br.com.senai.DAO.AutorDAO;
import br.com.senai.Entity.Autor;
import br.com.senai.Entity.Usuario;

import javax.inject.Inject;

@Path("/autor")
@Controller
public class AutorController {


    private AutorDAO autorDAO = new AutorDAO();


    @Inject
    private Result result;

    public AutorController() {
        Autor autor = autorDAO.getAutor();

        if (autor == null){
            Usuario usuario = new Usuario();
            usuario.setId(1L);
            usuario.setEmail("autor@gcb.com.br");
            usuario.setNmUsuario("Administrador");
            usuario.setAtivo(true);

            autor = new Autor();
            autor.setId(1);
            autor.setUsuario(usuario);
            autor.setNome("AUTOR GCB");
            this.save(autor);
        }
    }

    public void save(Autor admin) {
        autorDAO.save(admin);
    }

    @Path("/")
    public void findAutor() {
        Autor autor = autorDAO.getAutor();
        result.use(Results.json()).from(autor).include("usuario").serialize();
    }
}
