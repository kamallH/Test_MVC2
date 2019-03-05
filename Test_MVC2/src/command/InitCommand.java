package command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import commun.IConstante;

public class InitCommand implements ICommand {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("je suis dans le InitCommand");
		
		
		// stocker dans la session les filtres
		
		request.getSession().setAttribute("tabfiltres", service.ServicesFiltres.getFiltres() );
		
		return IConstante.JSP_ROOT + "catatalogue.jsp";
	}

}
