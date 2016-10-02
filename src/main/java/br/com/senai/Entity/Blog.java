package br.com.senai.Entity;

import java.util.Date;

public class Blog {

	private String nome;
	private String tipo;
	private boolean ativo;
	private Date dataCriacao;
	private String uri;

	public Blog() {
		super();
	}

	public Blog(String nome, String tipo, boolean ativo, Date dataCriacao, String uri) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.ativo = ativo;
		this.dataCriacao = dataCriacao;
		this.uri = uri;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
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
}
