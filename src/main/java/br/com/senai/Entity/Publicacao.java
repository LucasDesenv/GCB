package br.com.senai.Entity;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Publicacao {

	private Integer id;
	private Calendar dataCriacao;
	private String tags;
	private byte[] imagem;
	private String descricao;
	private String titulo;
	private String subtitulo;
	private Categoria categoria;
	private boolean publico;
	private final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");

	public Publicacao() {
		super();
		this.dataCriacao = Calendar.getInstance();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public Calendar getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Calendar dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getSubtitulo() {
		return subtitulo;
	}

	public void setSubtitulo(String subtitulo) {
		this.subtitulo = subtitulo;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public void setImagem(byte[] imagem) {
		this.imagem = imagem;
	}

	public byte[] getImagem() {
		return imagem;
	}

	public boolean isPublico() {
		return publico;
	}

	public void setPublico(boolean publico) {
		this.publico = publico;
	}

	@Override
	public String toString() {
		return "Publicacao [dataCriacao=" + dateFormat.format(dataCriacao.getTime()) + ", titulo=" + titulo + ", categoria=" + categoria + "]";
	}
}
