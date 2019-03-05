package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.Famille;

/**
 * @author 
 */
public class FamilleDAO implements IDao<Famille> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see DAO#create(java.lang.Object)
	 */
	public Famille create(Famille obj) {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see DAO#delete(java.lang.Object)
	 */
	public Famille delete(Famille obj) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see DAO#update(java.lang.Object)
	 */
	public Famille update(Famille obj) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see DAO#find(int)
	 */
	public Famille find(int id) {

		Famille fam = null;
		
		//requete 
		String requete = ("SELECT * FROM famille WHERE ID_FAMILLE = " + id);

		try {
			
			//connexion à la BDD
			Statement stmt = ConnexionDAO.getConnect().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			
			// execution de la requete
			ResultSet result = stmt.executeQuery(requete);

			// s'il y a un resultat, je cree l'objet fam avec les donnees trouvees
			if (result.first()) {
				fam = new Famille(id, result.getString("NOM_FAMILLE"));
				System.out.println("objet trouve");
			}
			// puis fermeture de la connexion

			stmt.close();
			System.out.println("Fermeture connexion ok");

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return fam;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see DAO#getListe()
	 */
	@Override
	public List<Famille> findAll() {

		ArrayList<Famille> listeFam = new ArrayList<Famille>();

		String requete = "SELECT ID_FAMILLE FROM famille ORDER BY ID_FAMILLE";

		try {

			Statement stmt = ConnexionDAO.getConnect().createStatement();
			// execution de la requete
			ResultSet result = stmt.executeQuery(requete);

			// tant que...
			while (result.next()) {
				System.out.println("result.getInt(\"ID_FAMILLE\")"+result.getInt("ID_FAMILLE"));
				listeFam.add(this.find(result.getInt("ID_FAMILLE")));

			}
			// puis fermeture de la connexion
			stmt.close();
			System.out.println("Fermeture connexion ok");

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return listeFam;
	}

}
