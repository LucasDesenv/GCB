package br.com.senai.DAO;

import java.util.List;

import br.com.senai.Entity.Administrador;

public class AdministradorDAO {

	private List<Administrador> admins;

	public void save(Administrador admin) {
		admins.add(admin);
		System.out.println(admin.getNome() + " salvo com sucesso!");
	}

	public void delete(Administrador admin) {
		admins.remove(admin);
		System.out.println(admin.getNome() + " deletado com sucesso!");
	}

	public void update(Administrador admin) {
		Administrador adminUpdate = listAdmin(admin);
		delete(admin);
		save(adminUpdate);
		System.out.println(admin.getNome() + " alterado com sucesso!");
	}

	public List<Administrador> listAll() {
		return admins;
	}

	public Administrador listAdmin(Administrador admin) {
		for (Administrador adminList : admins) {
			if (adminList.equals(admin)) {
				return admin;
			}
		}
		return null;
	}
}
