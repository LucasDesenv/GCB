package br.com.senai.Controller;

import br.com.senai.DAO.BlogDAO;
import br.com.senai.Entity.Blog;

public class BlogController {
	private BlogDAO blogDAO = new BlogDAO();

	public void save(Blog blog) {
		blogDAO.save(blog);
	}

	public Blog findBlod(){
		return blogDAO.getBlog();
	}
}
