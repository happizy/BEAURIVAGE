
public class Emplacement extends Categorie{

	private int numero;
	private Categorie categorie;
	
	public Emplacement(int numero, Categorie categorie,int superficie,int capacite,int prix) {
		super(superficie, capacite, prix);
		this.numero = numero;
		this.categorie = categorie;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	
	
	
}
