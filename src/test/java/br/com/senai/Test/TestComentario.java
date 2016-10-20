package br.com.senai.Test;

import java.util.Calendar;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import br.com.senai.Entity.Comentario;
import br.com.senai.Entity.Publicacao;
import br.com.senai.Entity.Usuario;
import br.com.senai.util.MessageUtil;

public class TestComentario {

	@Rule
	public ExpectedException expectedException = ExpectedException.none();

	private Comentario getComentario() {
		final Usuario usuario = new Usuario();
		usuario.setNmUsuario("Teste UsuÃ¡rio");
		usuario.setEmail("teste@test.com");
		final Comentario comentario = new Comentario();
		comentario.setUsuario(usuario);
		comentario.setDescricao("ComentÃ¡rio DescriÃ§Ã£o");
		return comentario;
	}

	/**
	 * CT-UNIT-COMENTARIO-000
	 */
	@Test
	public void naoDeveSerPossivelPublicacarNovoComentarioSemDescricao() {
		Comentario comentario = new Comentario();
		expectedException.expect(IllegalArgumentException.class);
		expectedException.expectMessage(MessageUtil.getMessage("msg.warn.comentario.descricao.nao.preenchida"));
		final Publicacao post = new Publicacao();
		post.publicarComentario(post, comentario);
	}

	/**
	 * CT-UNIT-COMENTARIO-000
	 */
	@Test
	public void naoDeveSerPossivelPublicacarNovoComenatarioSemUsuario() {
		Comentario comentario = new Comentario();
		expectedException.expect(IllegalArgumentException.class);
		expectedException.expectMessage(MessageUtil.getMessage("msg.warn.comentario.usuario.nao.preenchido"));
		final Publicacao post = new Publicacao();
		comentario.setDescricao("Minha descriÃ§Ã£o");
		post.publicarComentario(post, comentario);
	}

	/**
	 * CT-INT-COMENTARIO-002
	 */
	@Test
	public void deveSerPossivelPublicarNovoComentario() {
		final Publicacao post = new Publicacao();
		final Comentario comentario = getComentario();
		post.publicarComentario(post, comentario);
		Assert.assertEquals(post.getComentarios().size(), 1);
		Assert.assertEquals(post.getComentarios().get(0), comentario);
	}

	/**
	 * CT-INT-COMENTARIO-002
	 */
	@Test
	public void deveSerPossivelPublicarNovoComentarioETornarVisivel() {
		final Publicacao post = new Publicacao();
		final Comentario comentario = getComentario();
		post.publicarComentario(post, comentario);
		Assert.assertTrue(post.getComentarios().get(0).isPublico());
	}

	/**
	 * CT-UNIT-COMENTARIO-003
	 */
	@Test
	public void deveMostrarNoTopoUltimoComentario() {
		final Publicacao post = new Publicacao();
		final Comentario comentario = getComentario();
		Calendar dtCriacao = Calendar.getInstance();
		dtCriacao.set(Calendar.YEAR, 2014);
		comentario.setDataCriacao(dtCriacao);
		post.publicarComentario(post, comentario);
		Comentario outroComentario = null;
		outroComentario = getComentario();
		outroComentario.setDescricao("Novo comentÃ¡rio alternativo");
		post.publicarComentario(post, outroComentario);
		Assert.assertEquals(post.getComentarios().size(), 2);
		Assert.assertEquals(post.getComentarios().get(1), outroComentario);
	}
}