package br.com.senai.Controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Consumes;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.senai.DAO.UsuarioDAO;
import br.com.senai.Entity.Usuario;
import br.com.senai.util.MessageUtil;

@Controller
public class LoginController {

	@Inject
	private Result result;

	@Consumes("application/json")
	@Post("/login")
	public void login(Usuario usuario) {
		try {
			new UsuarioDAO().login(usuario);
			result.include("msg", MessageUtil.getMessage("msg.success.login"));
		} catch (Exception e) {
			e.printStackTrace();
			result.include("msg", e.getMessage());
		}

	}

	@Post("/logout")
	public void logout() {
		new UsuarioDAO().logout();
		result.include("msg", MessageUtil.getMessage("msg.success.logout"));
	}

	@Get("/usuario/logado")
	public Usuario findUsuarioLogado() {
		return UsuarioDAO.getUsuarioLogado();
	}
}
