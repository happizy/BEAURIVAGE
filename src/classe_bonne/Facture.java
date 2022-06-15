public class Facture {
	private int numero;
	private static int idnum = 0;
	private float prix;
	
	public Facture(int prix) {
		this.numero = Facture.idnum;
		this.prix = prix;
		Facture.idnum +=1;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public int getNumero() {
		return numero;
	}

	@Override
	public String toString() {
		return "Facture [numero=" + numero + ", prix=" + prix + "]";
	}
	
	public void afficher () {
		System.out.println("Numero : "+ this.numero + " Prix : " + this.prix + " €");
	}
	
	public static void main(String[] args) {
		Facture f = new Facture (150);
		Facture f1 = new Facture (520);
		f.afficher();
		f1.afficher();
	}
	
	
	
	
}