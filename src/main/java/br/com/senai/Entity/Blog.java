package br.com.senai.Entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.Validate;

import br.com.senai.util.MessageUtil;

public class Blog {

	private Integer id;
	private String nome;
	private boolean ativo;
	private Date dataCriacao;
	private List<Publicacao> publicacoes;
	private Autor autor;

	public Blog() {
		super();
		publicacoes = new ArrayList<>();
		this.autor = new Autor();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public List<Publicacao> getPublicacoes() {
		return publicacoes;
	}

	public void publicarAoPublico(Publicacao post) {
		Validate.isTrue(post.getDescricao() != null, MessageUtil.getMessage("msg.warn.post.descricao.nao.preenchida"));
		Validate.isTrue(post.getTitulo() != null, MessageUtil.getMessage("msg.warn.post.titulo.nao.preenchido"));
		Validate.isTrue(post.getSubtitulo() != null, MessageUtil.getMessage("msg.warn.post.subtitulo.nao.preenchido"));
		Validate.isTrue(post.getCategoria() != null, MessageUtil.getMessage("msg.warn.post.categoria.nao.preenchida"));
		post.setPublico(true);
		publicacoes.add(post);
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
}
