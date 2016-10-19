package br.com.senai.DAO;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.Validate;

import br.com.senai.Entity.Autor;
import br.com.senai.Entity.Leitor;
import br.com.senai.Entity.Perfil;
import br.com.senai.Entity.Usuario;
import br.com.senai.util.MessageUtil;

public class UsuarioDAO {

	private static Usuario usuarioLogado;
	private static List<Usuario> usuariosCadastrados = new ArrayList<>();

	static {
		final Usuario usuarioLeitor = new Usuario();
		usuarioLeitor.setId(3L);
		usuarioLeitor.setEmail("leitor1@gmail.com");
		usuarioLeitor.setNmUsuario("Leitor 1");
		usuarioLeitor.setAtivo(true);
		usuarioLeitor.setSenha("12345");
		usuariosCadastrados.add(usuarioLeitor);
		final Leitor leitor = new Leitor();
		leitor.setUsuario(usuarioLeitor);
		leitor.setNome("José");
		new LeitorDAO().save(leitor);

		final Usuario usuarioAutor = new Usuario(Perfil.ADMIN);
		usuarioAutor.setId(1L);
		usuarioAutor.setEmail("autor@gcb.com.br");
		usuarioAutor.setNmUsuario("Administrador");
		usuarioAutor.setSenha("9999");
		usuarioAutor.setAtivo(true);
		usuariosCadastrados.add(usuarioAutor);

		final Autor autor = new Autor();
		autor.setId(1);
		autor.setUsuario(usuarioAutor);
		autor.setNome("AUTOR GCB");
		new AutorDAO().save(autor);

	}

	public void login(Usuario usuario) {
		final Usuario usuarioSolicitado = usuariosCadastrados.stream().filter(usr -> usr.getNmUsuario().equals(usuario.getNmUsuario()))
			.findFirst().orElse(null);
		Validate.isTrue(usuarioSolicitado != null, MessageUtil.getMessage("msg.warn.login.usuario.senha.invalida"));
		Validate.isTrue(usuarioSolicitado.getSenha().equals(usuario.getSenha()), MessageUtil.getMessage("msg.warn.login.usuario.senha.invalida"));
		UsuarioDAO.usuarioLogado = usuario;
	}

	public static Usuario getUsuarioLogado() {
		return usuarioLogado;
	}

	public void logout() {
		UsuarioDAO.usuarioLogado = null;
	}

	static void addUsuario(Usuario usuario) {
		UsuarioDAO.usuariosCadastrados.add(usuario);
	}
}
