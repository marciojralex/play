package controllers;

import play.mvc.*;

import views.html.*;

/**
 * classe padrão criada com o projeto para mostrar como funcionaria o controller
 */
public class HomeController extends Controller {

    /**
     * metodo para a url "/"
     * @return retorna um Result que contém um codigo http ok = 200 e renderiza 
     * uma simples mensagem
     */
    public Result index() {
        return ok(index.render("Your new application is ready."));
    }

}
