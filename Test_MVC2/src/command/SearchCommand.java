package command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import commun.IConstante;

public class SearchCommand implements ICommand {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("je suis dans la recherche dans mon catalogue");
		
		
		// TODO Auto-generated method stub
		 return IConstante.JSP_ROOT + "catatalogue.jsp";
	}

}
