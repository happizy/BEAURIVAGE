
public abstract class Categorie {
	
	private int superficie;
	private int capacite;
	private int prix;
	public Categorie(int superficie, int capacite, int prix) {
		super();
		this.superficie = superficie;
		this.capacite = capacite;
		this.prix = prix;
	}
	public int getSuperficie() {
		return superficie;
	}
	public int getCapacite() {
		return capacite;
	}
	public int getPrix() {
		return prix;
	}
}
