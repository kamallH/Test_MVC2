package DAO;
import java.util.ArrayList;
import java.util.List;

/**
 * DAO est la classe abstraite (avec au moins 1 methode abstraite + sans constructeur) qui permet de générer des méthodes abstraites de DAO 
 * (pour se connecter à la BD) et des methodes create, delete, update, find, ArrayList, à complèter dans les classes spécifiques DAO.
 * 
 * @author nico
 */

public interface  IDao<T> {	// interface = impose un comportement via les methodes
	
	/**
	* Méthode de création
	* @param obj
	*/
	public T create(T obj);		// on renvoie l'objet T avec les modification qu'il a subit

	/**
	* Méthode pour effacer
	* @param obj 
	*/
	public T delete(T obj);

	/**
	* Méthode de mise à jour
	* @param obj
	*/
	public T update(T obj);

	/**
	* Méthode de recherche des informations
	* @param id
	*/
	public T find(int id);
  
  	/** 
  	 * Méthode de recherche de toutes les lignes d'une table
  	 */
	public List<T> findAll();
	
}