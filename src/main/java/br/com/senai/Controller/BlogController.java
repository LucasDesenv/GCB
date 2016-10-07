package br.com.senai.Controller;

import java.util.List;

import br.com.senai.DAO.BlogDAO;
import br.com.senai.Entity.Blog;

public class BlogController {
	private BlogDAO blogDAO = new BlogDAO();

	public void save(Blog blog) {
		blogDAO.save(blog);
	}

	public void delete(Blog blog) {
		blogDAO.delete(blog);
	}

	public void update(Blog blog) {
		blogDAO.update(blog);
	}

	public List<Blog> listAll() {
		return blogDAO.listAll();
	}

	public BlogController() {
	}

	public Blog getBlog(Blog blog) {
		return blogDAO.listAutor(blog);
	}
}
