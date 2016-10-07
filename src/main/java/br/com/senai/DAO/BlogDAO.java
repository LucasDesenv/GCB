package br.com.senai.DAO;

import java.util.List;

import br.com.senai.Entity.Blog;

public class BlogDAO {
	private List<Blog> blogs;

	public void save(Blog blog) {
		blogs.add(blog);
		System.out.println(blog.getNome() + " salvo com sucesso!");
	}

	public void delete(Blog blog) {
		blogs.remove(blog);
		System.out.println(blog.getNome() + " deletado com sucesso!");
	}

	public void update(Blog blog) {
		Blog blogOld = listAutor(blog);
		delete(blogOld);
		save(blog);
		System.out.println(blog.getNome() + " alterado com sucesso!");
	}

	public List<Blog> listAll() {
		return blogs;
	}

	public Blog listAutor(Blog blog) {
		for (Blog blogList : blogs) {
			if (blogList.equals(blog)) {
				return blog;
			}
		}
		return null;
	}
}
