package br.com.senai.Entity;

import java.util.Calendar;

public class Usuario {

	private String nmUsuario;
	private Long id;
	private String email;
	private Calendar dataCriacao;
	private boolean ativo;
	private Perfil perfil;
	private String senha;
	
	public Usuario() {
		this.dataCriacao = Calendar.getInstance();
		this.perfil = Perfil.REGULAR;
	}
	
	public Usuario(Perfil perfil) {
		this.dataCriacao = Calendar.getInstance();
		this.perfil = perfil;
		this.ativo = true;
	}

	public String getNmUsuario() {
		return nmUsuario;
	}

	public void setNmUsuario(String nmUsuario) {
		this.nmUsuario = nmUsuario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Calendar getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Calendar dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
