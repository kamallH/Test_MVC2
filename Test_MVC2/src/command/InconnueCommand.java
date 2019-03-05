package command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import commun.IConstante;

public class InconnueCommand implements ICommand {

	
	public String execute(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException {
		
		//renvoi vers une page d'erreur si la commande est inconnue dans le FrontControleur
		
		
		//retourne la page sous jsproot = WEB-INF/jsp/+error404.jsp
		return IConstante.JSP_ROOT+"error404.jsp";
	}

}
