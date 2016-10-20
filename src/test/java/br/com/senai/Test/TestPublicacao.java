package br.com.senai.Test;

import java.util.Calendar;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import br.com.senai.Entity.Autor;
import br.com.senai.Entity.Categoria;
import br.com.senai.Entity.Publicacao;
import br.com.senai.util.MessageUtil;

public class TestPublicacao {

	@Rule
	public ExpectedException expectedException = ExpectedException.none();

	private Publicacao getPublicacao() {
		final Publicacao post = new Publicacao();
		post.setDescricao("Minha descrição");
		post.setTitulo("Titulo");
		post.setSubtitulo("Subtitulo");
		post.setCategoria(Categoria.ENTRETENIMENTO);
		return post;
	}

	/**
	 * CT-UNIT- POSTAR-000
	 */
	@Test
	public void naoDeveSerPossivelPublicacaoarNovoConteudoSemDescricao() {
		expectedException.expect(IllegalArgumentException.class);
		expectedException.expectMessage(MessageUtil.getMessage("msg.warn.post.descricao.nao.preenchida"));
		new Autor().publicarNovoPost(new Publicacao());
	}

	/**
	 * CT-UNIT- POSTAR-000
	 */
	@Test
	public void naoDeveSerPossivelPublicacaoarNovoConteudoSemTitulo() {
		expectedException.expect(IllegalArgumentException.class);
		expectedException.expectMessage(MessageUtil.getMessage("msg.warn.post.titulo.nao.preenchido"));
		final Publicacao post = new Publicacao();
		post.setDescricao("Minha descrição");
		new Autor().publicarNovoPost(post);
	}

	/**
	 * CT-UNIT- POSTAR-000
	 */
	@Test
	public void naoDeveSerPossivelPublicacaoarNovoConteudoSemSubtitulo() {
		expectedException.expect(IllegalArgumentException.class);
		expectedException.expectMessage(MessageUtil.getMessage("msg.warn.post.subtitulo.nao.preenchido"));
		final Publicacao post = new Publicacao();
		post.setDescricao("Minha descrição");
		post.setTitulo("Titulo");
		new Autor().publicarNovoPost(post);
	}

	/**
	 * CT-UNIT- POSTAR-000
	 */
	@Test
	public void naoDeveSerPossivelPublicacaoarNovoConteudoSemCategoria() {
		expectedException.expect(IllegalArgumentException.class);
		expectedException.expectMessage(MessageUtil.getMessage("msg.warn.post.categoria.nao.preenchida"));
		final Publicacao post = new Publicacao();
		post.setDescricao("Minha descrição");
		post.setTitulo("Titulo");
		post.setSubtitulo("Subtitulo");
		new Autor().publicarNovoPost(post);
	}

	/**
	 * CT-INT- POSTAR-001
	 */
	@Test
	public void deveSerPossivelPublicacarNovoConteudo() {
		Autor autor = new Autor();
		final Publicacao post = getPublicacao();
		autor.publicarNovoPost(post);
		Assert.assertEquals(autor.getPublicacoes().size(), 1);
		Assert.assertEquals(autor.getPublicacoes().get(0), post);
	}

	/**
	 * CT-INT- POSTAR-002
	 */
	@Test
	public void deveMostrarAosLeitoresOsPostsPublicos() {
		Autor autor = new Autor();
		final Publicacao post = getPublicacao();
		autor.publicarNovoPost(post);
		Assert.assertTrue(autor.getPublicacoes().get(0).isPublico());
	}

	/**
	 * CT-UNIT- POSTAR-005
	 */
	@Test
	public void deveMostrarNoTopoUltimoPost() {
		Autor autor = new Autor();
		Publicacao publicacao = getPublicacao();
		Calendar calendario = Calendar.getInstance();
		calendario.set(Calendar.YEAR, 2012);
		publicacao.setDataCriacao(calendario);
		autor.publicarNovoPost(publicacao);

		Publicacao outroPost = null;
		outroPost = publicacao;
		outroPost.setDescricao("Novo post alternativo");
		autor.publicarNovoPost(outroPost);

		Assert.assertEquals(autor.getPublicacoes().size(), 2);
		Assert.assertEquals(autor.getPublicacoes().get(0), outroPost);
	}

	/**
	 * CD-INT- AUTOR-001
	 */
	@Test
	public void naoDeveSerPossivelPublicarComAutorInativo() {
		Autor autor = new Autor();
		autor.inativar();
		expectedException.expect(IllegalArgumentException.class);
		expectedException.expectMessage(MessageUtil.getMessage("msg.warn.publicar.autor.inativo"));
		autor.publicarNovoPost(getPublicacao());
	}
}
