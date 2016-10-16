package br.com.senai.DAO;

import java.util.List;

import br.com.senai.Entity.Publicacao;

public class PublicacaoDAO {
	private List<Publicacao> publicacoes;

	public void save(Publicacao publicacao) {
		
		publicacoes.add(publicacao);
		System.out.println(publicacao.getTitulo() + " salvo com sucesso!");
	}

	public void delete(Publicacao publicacao) {
		publicacoes.remove(publicacao);
		System.out.println(publicacao.getTitulo() + " deletado com sucesso!");
	}

	public void update(Publicacao publicacao) {
		Publicacao publicacaoOld = listPublicacao(publicacao);
		delete(publicacaoOld);
		save(publicacao);
		System.out.println(publicacao.getTitulo() + " alterado com sucesso!");
	}

	public List<Publicacao> listAll() {
		return publicacoes;
	}

	public Publicacao listPublicacao(Publicacao publicacao) {
		for (Publicacao publicacaoList : publicacoes) {
			if (publicacaoList.equals(publicacao)) {
				return publicacao;
			}
		}
		return null;
	}
}
