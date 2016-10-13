package br.com.senai.Test;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import br.com.senai.Entity.Blog;
import br.com.senai.Entity.Categoria;
import br.com.senai.Entity.Publicacao;
import br.com.senai.util.MessageUtil;

public class TestPublicacao {

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
		blog.publicarAoPublico(new Publicacao());
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
		blog.publicarAoPublico(post);
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
		blog.publicarAoPublico(post);
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
		blog.publicarAoPublico(post);
	}

	/**
	 * CT-INT- POSTAR-001
	 */
	@Test
	public void deveSerPossivelPublicacarNovoConteudo() {
		Blog blog = new Blog();
		final Publicacao post = new Publicacao();
		post.setDescricao("Minha descrição");
		post.setTitulo("Titulo");
		post.setSubtitulo("Subtitulo");
		post.setCategoria(Categoria.ENTRETENIMENTO);
		blog.publicarAoPublico(post);
		Assert.assertEquals(blog.getPublicacoes().size(), 1);
		Assert.assertEquals(blog.getPublicacoes().get(0), post);
	}
	
	/**
	 * CT-INT- POSTAR-002
	 */
	@Test
	public void deveMostrarAosLeitoresOsPostsPublicos(){
		Blog blog = new Blog();
		final Publicacao post = new Publicacao();
		post.setDescricao("Minha descrição");
		post.setTitulo("Titulo");
		post.setSubtitulo("Subtitulo");
		post.setCategoria(Categoria.ENTRETENIMENTO);
		blog.publicarAoPublico(post);
		Assert.assertTrue(blog.getPublicacoes().get(0).isPublico());
	}
}
