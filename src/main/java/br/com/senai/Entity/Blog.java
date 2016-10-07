package br.com.senai.Entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.Validate;

import br.com.senai.util.MessageUtil;

public class Blog {

	private Integer id;
	private String nome;
	private String tipo;
	private boolean ativo;
	private Date dataCriacao;
	private String uri;
	private List<Publicacao> publicacoes;

	public Blog() {
		super();
		publicacoes = new ArrayList<>();
	}

	public Blog(String nome, String tipo, boolean ativo, Date dataCriacao, String uri) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.ativo = ativo;
		this.dataCriacao = dataCriacao;
		this.uri = uri;
		publicacoes = new ArrayList<>();
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Publicacao> getPublicacoes() {
		return publicacoes;
	}

	public void postar(Publicacao post) {
		Validate.isTrue(post.getDescricao() != null, MessageUtil.getMessage("msg.warn.post.descricao.nao.preenchida"));
		Validate.isTrue(post.getTitulo() != null, MessageUtil.getMessage("msg.warn.post.titulo.nao.preenchido"));
		Validate.isTrue(post.getSubtitulo() != null, MessageUtil.getMessage("msg.warn.post.subtitulo.nao.preenchido"));
		Validate.isTrue(post.getCategoria() != null, MessageUtil.getMessage("msg.warn.post.categoria.nao.preenchida"));
		Validate.isTrue(post.getAutor() != null, MessageUtil.getMessage("msg.warn.post.autor.nao.encontrado"));
		publicacoes.add(post);
	}
}
