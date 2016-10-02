package br.com.senai.Entity;

import java.util.Date;

public class Autor {

	private String nome;
	private String usuarioNome;
	private boolean ativo;
	private Date dataCriacao;
	private String uri;
	private Blog blog;
	private Administrador administrador;

	public Autor() {
		super();
	}

	public Autor(String nome, String usuarioNome, boolean ativo, Date dataCriacao, String uri, Blog blog,
			Administrador administrador) {
		super();
		this.nome = nome;
		this.usuarioNome = usuarioNome;
		this.ativo = ativo;
		this.dataCriacao = dataCriacao;
		this.uri = uri;
		this.blog = blog;
		this.administrador = administrador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuarioNome() {
		return usuarioNome;
	}

	public void setUsuarioNome(String usuarioNome) {
		this.usuarioNome = usuarioNome;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public Blog getBlog() {
		return blog;
	}

	public void setBlog(Blog blog) {
		this.blog = blog;
	}

	public Administrador getAdministrador() {
		return administrador;
	}

	public void setAdministrador(Administrador administrador) {
		this.administrador = administrador;
	}
}
