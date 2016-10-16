package br.com.senai.Entity;

import java.util.ArrayList;
import java.util.List;

public class Autor extends Pessoa {
	private Integer id;
	private Usuario usuario;
	private List<Publicacao> publicacoes;

	public Autor() {
		super();
		setUsuario(new Usuario(Perfil.ADMIN));
		this.publicacoes = new ArrayList<>();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Publicacao> getPublicacoes() {
		publicacoes.sort((a,b) -> b.getDataCriacao().compareTo(a.getDataCriacao()));
		return publicacoes;
	}

	public void publicarNovoPost(Publicacao novoPost) {
		publicacoes.add(novoPost.publicarAoPublico(this));
	}

	public void setPublicacoes(List<Publicacao> publicacoes) {
		this.publicacoes = publicacoes;
	}

	public void inativar() {
		this.usuario.setAtivo(false);
	}
}
