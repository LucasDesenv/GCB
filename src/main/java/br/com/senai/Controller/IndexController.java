package br.com.senai.Controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.senai.Entity.Autor;
import br.com.senai.Entity.Usuario;

@Controller
public class IndexController
{

   @Inject
   private Result result;
   private AutorController autorController;

   @Path("/")
   public void index()
   {

   }
}