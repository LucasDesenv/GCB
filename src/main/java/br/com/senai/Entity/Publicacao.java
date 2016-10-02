package br.com.senai.Entity;

import java.util.Date;

public class Publicacao {

	private String titulo;
	private String subTitulo;
	private Date dataCriacao;
	private Date dataAgendamento;
	private String tags;
	private String categoria;
	private Autor autor;
	private Blog blog;
	private String imagem;

	public Publicacao() {
		super();
	}

	public Publicacao(String titulo, String subTitulo, Date dataCriacao, Date dataAgendamento, String tags,
			String categoria, Autor autor, Blog blog, String imagem) {
		super();
		this.titulo = titulo;
		this.subTitulo = subTitulo;
		this.dataCriacao = dataCriacao;
		this.dataAgendamento = dataAgendamento;
		this.tags = tags;
		this.categoria = categoria;
		this.autor = autor;
		this.blog = blog;
		this.imagem = imagem;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSubTitulo() {
		return subTitulo;
	}

	public void setSubTitulo(String subTitulo) {
		this.subTitulo = subTitulo;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Date getDataAgendamento() {
		return dataAgendamento;
	}

	public void setDataAgendamento(Date dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Blog getBlog() {
		return blog;
	}

	public void setBlog(Blog blog) {
		this.blog = blog;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
}
