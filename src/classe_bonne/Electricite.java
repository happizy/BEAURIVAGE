
public class Electricite extends Prestation{

	private static int prix = 21;
	
	public Electricite() {
		
	}
	
	public void consulterPrestation() {
		System.out.println("Le prix de l'electricite est de :" +prix);
	}

	public static int getPrix() {
		return prix;
	}
	
}
