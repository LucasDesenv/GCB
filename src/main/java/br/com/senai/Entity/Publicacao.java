package br.com.senai.Entity;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.apache.commons.lang3.Validate;

import br.com.senai.util.MessageUtil;

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
	private List<Comentario> comentarios;

	public Publicacao() {
		super();
		comentarios = new ArrayList<>();
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

	public List<Comentario> getComentarios() {
		comentarios.sort((a,b) -> a.getDataCriacao().compareTo(b.getDataCriacao()));
		return comentarios;
	}

	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}

	@Override
	public String toString() {
		return "Publicacao [dataCriacao=" + dateFormat.format(dataCriacao.getTime()) + ", titulo=" + titulo + ", categoria=" + categoria + "]";
	}
	
	public void publicarComentario(Publicacao post, Comentario comentario) {
		Validate.isTrue(comentario.getDescricao() != null, MessageUtil.getMessage("msg.warn.comentario.descricao.nao.preenchida"));
		Validate.isTrue(comentario.getUsuario() != null, MessageUtil.getMessage("msg.warn.comentario.usuario.nao.preenchido"));
		comentario.setPublico(true);
		comentarios.add(comentario);
	}
	
	protected Publicacao publicarAoPublico(Autor autor) {
		Validate.isTrue(this.getDescricao() != null, MessageUtil.getMessage("msg.warn.post.descricao.nao.preenchida"));
		Validate.isTrue(this.getTitulo() != null, MessageUtil.getMessage("msg.warn.post.titulo.nao.preenchido"));
		Validate.isTrue(this.getSubtitulo() != null, MessageUtil.getMessage("msg.warn.post.subtitulo.nao.preenchido"));
		Validate.isTrue(this.getCategoria() != null, MessageUtil.getMessage("msg.warn.post.categoria.nao.preenchida"));
		Validate.isTrue(autor.getUsuario().isAtivo(),MessageUtil.getMessage("msg.warn.publicar.autor.inativo"));
		this.setPublico(true);
		return this;
	}
}
