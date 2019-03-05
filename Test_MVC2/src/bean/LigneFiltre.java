package bean;

public class LigneFiltre {

	//ATTRIBUTS
	private int 	id;
	private String  libelle;
	private boolean etat;
	/**
	 * 
	 */
	public LigneFiltre() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id
	 * @param libelle
	 * @param etat
	 */
	public LigneFiltre(int id, String libelle, boolean etat) {
		super();
		this.id 		= id;
		this.libelle 	= libelle;
		this.etat	 	= etat;
	}
	
	// G & S
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public boolean isEtat() {
		return etat;
	}
	public void setEtat(boolean etat) {
		this.etat = etat;
	}
	
	public String getEtatHTML() {
		if( this.isEtat()==false) {
			return "";
		}else {
			return "checked";
		}
	}
	
	
	
	
	
}
