package service;

import java.util.ArrayList;
import java.util.List;

import DAO.FamilleDAO;
import DAO.IDao;
import bean.BlocFiltre;
import bean.Famille;
import bean.LigneFiltre;


/**
 * 
 * @author bruno
 *
 *	Class regroupant les 3 filtres : Fam, SSFam, Marque
 *  remplir filtres, et lignes de CB
 *
 */
public class ServicesFiltres {
	
	public static final int FAMILLE   	= 0;
	public static final int SSFAMILLE 	= 1;
	public static final int MARQUE		= 2;
	
	private static List<BlocFiltre> filtres = new ArrayList<BlocFiltre>();
	static IDao<Famille> daoFam=new FamilleDAO();
	public static void init() {
		BlocFiltre monBloc1 = new BlocFiltre("Famille");
		List<Famille> listFam =daoFam.findAll();
		
		for (Famille famille : listFam) {
			
		System.out.println("je suis dans la boucle pour afficher des familles : "+famille);
			monBloc1.addLigne(
				new LigneFiltre(famille.getId(), 
								famille.getIntitule(),
								false
								)
							);
		}
		
		
		filtres.add(monBloc1);
		
		
		
	}
	
	public static  List<BlocFiltre> getFiltres(){
		return filtres;
		
	}
/*	public static List<LigneFiltre> getFamille(){
		List<LigneFiltre> liste = new ArrayList<LigneFiltre>();
		for (int i = 0; i<4; i++) {
			liste.add(
				new LigneFiltre(i, 
								"famille" +1,
								false
								)
							);
		}
		return liste;
	}*/
}
