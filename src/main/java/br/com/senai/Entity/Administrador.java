package br.com.senai.Entity;

import java.util.Date;

public class Administrador {
	private Integer id;
	private String nome;
	private String usuarioNome;
	private boolean ativo;
	private Date dataCriacao;

	public Administrador() {
		super();
	}

	public Administrador(String nome, String usuarioNome, boolean ativo, Date dataCriacao) {
		super();
		this.nome = nome;
		this.usuarioNome = usuarioNome;
		this.ativo = ativo;
		this.dataCriacao = dataCriacao;
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
