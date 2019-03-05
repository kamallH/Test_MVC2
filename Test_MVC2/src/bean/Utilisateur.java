package bean;

/**
 * 
 * @author jo_ri_000 un objet client pour manipuler les client contient le user
 *         et le mot de pass du client sans doute l'adresse mail bientot
 */
public class Utilisateur {
	// attributs
	int id_client;
	private String user;
	private String pass;

	/**
	 * constructeur par defaut id=-1 et les autres champs sont en chaines vide
	 */
	public Utilisateur() {
		this.id_client = -1;
		this.user = "";
		this.pass = "";
	}

	public int getId_client() {
		return id_client;
	}

	public void setId_client(int id_client) {
		this.id_client = id_client;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "Client [id_client=" + id_client + ", user=" + user + ", pass=" + pass + "]";
	}

	public boolean isValidate() {
		if ("lana".equals(this.user) && "travail!".equals(this.pass)) {
			return true;
		} else {
			return false;

		}
	}

}
