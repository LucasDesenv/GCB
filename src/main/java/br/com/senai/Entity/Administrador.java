package br.com.senai.Entity;

import java.util.Calendar;

public class Administrador {
	private Integer id;
	private String nome;
	private Usuario usuario;
	private boolean ativo;
	private Calendar dataCriacao;

	public Administrador() {
		super();
	}

	public Administrador(Integer id, String nome, Usuario usuario, boolean ativo) {
		super();
		this.id = id;
		this.nome = nome;
		this.usuario = usuario;
		this.ativo = ativo;
		this.dataCriacao = Calendar.getInstance();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public Calendar getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Calendar dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
