package br.com.senai.Entity;

public class Autor extends Pessoa{
	private Integer id;
	private Usuario usuario;

	public Autor() {
		super();
		setUsuario(new Usuario(Perfil.ADMIN));
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
