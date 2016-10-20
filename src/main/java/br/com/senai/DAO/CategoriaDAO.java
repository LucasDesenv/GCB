package br.com.senai.DAO;


import br.com.senai.Entity.Blog;
import br.com.senai.Entity.Categoria;
import br.com.senai.util.MessageUtil;
public class CategoriaDAO {

    private static Categoria categoria;

    public Categoria getCategoria() {
        return categoria;
    }
}
