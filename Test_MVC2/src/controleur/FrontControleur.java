	package controleur;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ConnexionDAO;
import command.ICommand;
import command.InconnueCommand;
import commun.IConstante;

/**
 * Servlet implementation class FrontControleur
 * point d'entrée de toutes les requetes clients http
 * 
 * loadOnStartup=1 monte la servlet dés le demarrage de TomCat
 *  
 *  les annotations :@nom:
 * urlPattern remplace le servlet mapping du  web-xml.
 * 
 */
//@WebServlet(description = "controleur principal", urlPatterns = { "/frontControleur", "/index", "*.do"}, loadOnStartup=1)
@WebServlet("/frontControleur")
public class FrontControleur extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontControleur() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	//methode principal
    	System.out.println("nom de servlet : "+this.getServletName()+" methode "+request.getMethod()+" uri "+request.getRequestURI());
    	
    	ConnexionDAO connect = new ConnexionDAO();
    	connect.getConnect();
    	
    	
    	//on recupere la class de command qui correspont à la requete
    	ICommand command = getCommand(request);
    	//on execute la methode execute et
    	String urlSuite = command.execute(request, response);
    	System.out.println("mon url " +urlSuite);
    	//on la renvoi dans la requete suivante
    	request.getRequestDispatcher(urlSuite).forward(request, response);
    	
    }

	//methode doGet et doPost
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
		
		
	}
	
	private ICommand getCommand(HttpServletRequest request) {
		//command.NomCommand correspont à la structure ou "nom" correspont à la class que l'on retrouve dans le cmd
		// on le remplit via les constantes contenues dans "IConstante"
		String cmd  =   IConstante.PACKAGE_COMMAND + request.getParameter(IConstante.CLEFS_COMMAND)+IConstante.CLASS_COMMAND;
		//affichage dans la console
		System.out.println("FrontControleur, ma cmd : " + cmd);
		
		ICommand cl;
		
		try {
			cl = (ICommand) Class.forName(cmd).newInstance();
		}catch (Exception e) {
			System.out.println(e.getMessage());
			return new InconnueCommand();
		} 
			
		
		return cl;	
	}
		

}
