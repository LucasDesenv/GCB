package br.com.senai.Entity;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Comentario {
	private Integer id;
	private Usuario usuario;
	private String descricao;
	private final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
	private Calendar dataCriacao;
	private boolean publico;

	public Comentario() {
		super();
		this.dataCriacao = Calendar.getInstance();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isPublico() {
		return publico;
	}

	public void setPublico(boolean publico) {
		this.publico = publico;
	}

	public Calendar getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Calendar dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	@Override
	public String toString() {
		return "Comentario [id=" + id + ", usuario=" + usuario + ", descricao=" + descricao + ", dataCriacao="
				+ dateFormat.format(dataCriacao.getTime()) + ", publico=" + publico + "]";
	}
}