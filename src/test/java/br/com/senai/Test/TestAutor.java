package br.com.senai.Test;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import br.com.senai.Controller.AutorController;
import br.com.senai.Entity.Autor;
import br.com.senai.util.MessageUtil;

public class TestAutor {
	@Rule
	public ExpectedException expectedException = ExpectedException.none();
	
	@Test
	public void naoDeveSerPossivelCadastrarMaisDeUmAutor() {
		new AutorController().save(new Autor());
		expectedException.expect(IllegalArgumentException.class);
		expectedException.expectMessage(MessageUtil.getMessage("msg.warn.ja.existe.um.autor.cadastrado"));
		new AutorController().save(new Autor());
	}

}
