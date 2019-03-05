package bean;

/**
 * @author 
 */
public class Famille {
	
	private int id;
	
	private String intitule;
	
	
	/**
	 * Constructeur sans paramètre
	 */
	
	public Famille() {
	
	}
	
	/**
	 * Constructeur avec l'intitule
	 */
	
	public Famille(String Fam) {
		this.intitule = Fam;
	
	}
	
	/**
	 * Constructeur avec id + intitule
	 */
	
	public Famille(int id, String ssFam) {
		this.id=id;
		this.intitule = ssFam;
	
	}

	/**
	 * @return the hello
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the hello
	 */
	public String getIntitule() {
		return intitule;
	}

	/**
	 * @param intitule_ssFamille the intitule_ssFamille to set
	 */
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	
	public String toString() {
		return this.id + " - " + this.intitule + " - ";
		
	}

}
