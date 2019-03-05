package bean;

import java.util.ArrayList;
import java.util.List;

public class BlocFiltre {
	
	// ATTRIBUTS
	private String 				nomBF;
	private List<LigneFiltre> 	lignesFiltre;
	/**
	 * 
	 */
	public BlocFiltre() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param nomBF
	 * @param lignesFiltre
	 */
	public BlocFiltre(String nomBF) {
		super();
		this.nomBF = nomBF;
		this.lignesFiltre = new ArrayList<LigneFiltre>();
	}
	
	public String getNomBF() {
		return nomBF;
	}
	public void setNomBF(String nomBF) {
		this.nomBF = nomBF;
	}
	public List<LigneFiltre> getLignesFiltre() {
		return lignesFiltre;
	}
	public void setLignesFiltre(List<LigneFiltre> lignesFiltre) {
		this.lignesFiltre = lignesFiltre;
	}
	
	public void addLigne(LigneFiltre mLF) {
		this.lignesFiltre.add(mLF);
	}
	
	
}