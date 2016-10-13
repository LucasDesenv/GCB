package br.com.senai.Test;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import br.com.senai.Controller.BlogController;
import br.com.senai.Entity.Blog;
import br.com.senai.util.MessageUtil;

public class TestBlog {

	@Rule
	public ExpectedException expectedException = ExpectedException.none();
	
	@Test
	public void naoDeveSerPossivelCadastrarMaisDeUmAutor() {
		new BlogController().save(new Blog());
		expectedException.expect(IllegalArgumentException.class);
		expectedException.expectMessage(MessageUtil.getMessage("msg.warn.ja.existe.um.blog.cadastrado"));
		new BlogController().save(new Blog());
	}
}
