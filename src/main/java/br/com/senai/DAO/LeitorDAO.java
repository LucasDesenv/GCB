package br.com.senai.DAO;

import java.util.ArrayList;
import java.util.List;

import br.com.senai.Entity.Leitor;

public class LeitorDAO {

	private static final List<Leitor> LEITORES = new ArrayList<>();

	public void save(Leitor leitor) {
		LEITORES.add(leitor);
	}

}
