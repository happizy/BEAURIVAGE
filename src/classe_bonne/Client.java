public class Client {
	private int noClient;
	private String nom;
	private String prenom;
	private String adresse;
	private int num_cli = 0;
	
	public Client(String nom, String prenom, String adresse) {
		this.noClient = this.num_cli;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.num_cli +=1;
	}

	public int getNoClient() {
		return noClient;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Client [noClient=" + noClient + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + "]";
	}
	
	public void afficher() {
		System.out.println("Num client : " + this.noClient + " Nom : " + this.nom  
				+ " Prénom : " + this.prenom + "\nAdresse : " + this.adresse);
	}
	
	public static void main(String[] args) {
		Client c = new Client ("Bob", "Robert", "20 rue des chemins");
		Client c1 = new Client ("Toto", "ta", "5 chemin des terres");
		c.afficher();
		c1.afficher();
	}
	
	
}