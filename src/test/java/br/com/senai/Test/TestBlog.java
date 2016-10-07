package br.com.senai.Test;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import br.com.senai.Entity.Autor;
import br.com.senai.Entity.Blog;
import br.com.senai.Entity.Categoria;
import br.com.senai.Entity.Publicacao;
import br.com.senai.util.MessageUtil;

public class TestBlog {

	@Rule
	public ExpectedException expectedException = ExpectedException.none();

	/**
	 * CT-UNIT- POSTAR-000
	 */
	@Test
	public void naoDeveSerPossivelPublicacaoarNovoConteudoSemDescricao() {
		Blog blog = new Blog();
		expectedException.expect(IllegalArgumentException.class);
		expectedException.expectMessage(MessageUtil.getMessage("msg.warn.post.descricao.nao.preenchida"));
		blog.postar(new Publicacao());
	}

	/**
	 * CT-UNIT- POSTAR-000
	 */
	@Test
	public void naoDeveSerPossivelPublicacaoarNovoConteudoSemTitulo() {
		Blog blog = new Blog();
		expectedException.expect(IllegalArgumentException.class);
		expectedException.expectMessage(MessageUtil.getMessage("msg.warn.post.titulo.nao.preenchido"));
		final Publicacao post = new Publicacao();
		post.setDescricao("Minha descrição");
		blog.postar(post);
	}

	/**
	 * CT-UNIT- POSTAR-000
	 */
	@Test
	public void naoDeveSerPossivelPublicacaoarNovoConteudoSemSubtitulo() {
		Blog blog = new Blog();
		expectedException.expect(IllegalArgumentException.class);
		expectedException.expectMessage(MessageUtil.getMessage("msg.warn.post.subtitulo.nao.preenchido"));
		final Publicacao post = new Publicacao();
		post.setDescricao("Minha descrição");
		post.setTitulo("Titulo");
		blog.postar(post);
	}

	/**
	 * CT-UNIT- POSTAR-000
	 */
	@Test
	public void naoDeveSerPossivelPublicacaoarNovoConteudoSemCategoria() {
		Blog blog = new Blog();
		expectedException.expect(IllegalArgumentException.class);
		expectedException.expectMessage(MessageUtil.getMessage("msg.warn.post.categoria.nao.preenchida"));
		final Publicacao post = new Publicacao();
		post.setDescricao("Minha descrição");
		post.setTitulo("Titulo");
		post.setSubtitulo("Subtitulo");
		blog.postar(post);
	}

	/**
	 * CT-UNIT- POSTAR-000
	 */
	@Test
	public void naoDeveSerPossivelPublicacaoarNovoConteudoSemAutor() {
		Blog blog = new Blog();
		expectedException.expect(IllegalArgumentException.class);
		expectedException.expectMessage(MessageUtil.getMessage("msg.warn.post.autor.nao.encontrado"));
		final Publicacao post = new Publicacao();
		post.setDescricao("Minha descrição");
		post.setTitulo("Titulo");
		post.setSubtitulo("Subtitulo");
		post.setCategoria(Categoria.ENTRETENIMENTO);
		blog.postar(post);
	}

	/**
	 * CT-UNIT- POSTAR-000
	 */
	@Test
	public void deveSerPossivelPublicacaoarNovoConteudo() {
		Blog blog = new Blog();
		final Publicacao post = new Publicacao();
		post.setDescricao("Minha descrição");
		post.setTitulo("Titulo");
		post.setSubtitulo("Subtitulo");
		post.setCategoria(Categoria.ENTRETENIMENTO);
		post.setAutor(new Autor());
		blog.postar(post);
		Assert.assertEquals(blog.getPublicacoes().size(), 1);
		Assert.assertEquals(blog.getPublicacoes().get(0), post);
	}
}
