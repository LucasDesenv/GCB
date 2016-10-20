package br.com.senai.Controller;

import java.util.List;

import br.com.caelum.vraptor.*;
import br.com.caelum.vraptor.view.Results;
import br.com.senai.DAO.PublicacaoDAO;
import br.com.senai.Entity.Publicacao;

import javax.inject.Inject;

@Controller
@Path("/publicacoes")
public class PublicacaoController {

	@Inject
	private Result result;

	private PublicacaoDAO publicacaoDAO = new PublicacaoDAO();

	@Post("/")
    @Consumes("application/json")
	public void save(Publicacao publicacao) {
		publicacaoDAO.save(publicacao);
        result.use(Results.json()).withoutRoot().from(publicacao).serialize();
	}

	public void delete(Publicacao publicacao) {
		publicacaoDAO.delete(publicacao);
	}

	public void update(Publicacao publicacao) {
		publicacaoDAO.update(publicacao);
	}

	public List<Publicacao> listAll() {
		return publicacaoDAO.listAll();
	}

	public PublicacaoController() {
	}

	public Publicacao getPublicacao(Publicacao publicacao) {
		return publicacaoDAO.listPublicacao(publicacao);
	}
}
