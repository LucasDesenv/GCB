package br.com.senai.DAO;

import br.com.senai.Entity.Blog;
import br.com.senai.util.MessageUtil;

public class BlogDAO {
	private static Blog blog;

	public void save(Blog blog) {
		if (BlogDAO.blog != null) {
			throw new IllegalArgumentException(MessageUtil.getMessage("msg.warn.ja.existe.um.blog.cadastrado"));
		}
		BlogDAO.blog = blog;
		System.out.println(BlogDAO.blog.getNome() + " salvo com sucesso!");
	}

	public Blog getBlog() {
		return blog;
	}
}
