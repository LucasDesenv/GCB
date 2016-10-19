package br.com.senai.Controller;

import java.util.List;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Result;
import br.com.senai.DAO.PublicacaoDAO;
import br.com.senai.Entity.Publicacao;

import javax.inject.Inject;

@Controller
public class PublicacaoController {

	@Inject
	private Result result;

	private PublicacaoDAO publicacaoDAO = new PublicacaoDAO();

	public void save(Publicacao publicacao) {
		publicacaoDAO.save(publicacao);
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
