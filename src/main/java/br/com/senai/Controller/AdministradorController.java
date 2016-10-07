package br.com.senai.Controller;

import java.util.List;

import br.com.senai.DAO.AdministradorDAO;
import br.com.senai.Entity.Administrador;

public class AdministradorController {

	private Administrador admin;
	private AdministradorDAO adminDAO = new AdministradorDAO();

	public void save(Administrador admin) {
		adminDAO.save(admin);
	}

	public void delete(Administrador admin) {
		adminDAO.delete(admin);
	}

	public void update(Administrador admin) {
		adminDAO.update(admin);
	}

	public List<Administrador> listAll() {
		return adminDAO.listAll();
	}

	public AdministradorController() {
	}

	public Administrador getAdmin() {
		return admin;
	}

	public void setAdmin(Administrador admin) {
		this.admin = admin;
	}
}
