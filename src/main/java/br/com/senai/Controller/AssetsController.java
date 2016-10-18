package br.com.senai.Controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;

import javax.inject.Inject;

@Controller
@Path("/assets")
public class AssetsController {

    private final Result result;

    protected AssetsController() {
        this(null);
    }

    @Inject
    public AssetsController(Result result) {
        this.result = result;
    }

    @Path("/{arquivo*}")
    public void assets(String arquivo) {
        result.use(Results.page()).forwardTo("/WEB-INF/jsp/assets/" + arquivo);
    }
}
