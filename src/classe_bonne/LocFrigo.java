
public class LocFrigo extends Prestation{

	private static int prix = 35;
	
	public LocFrigo() {
		
	}

	
	public static int getPrix() {
		return prix;
	}

	public void consulterPrestation() {
		System.out.println("prix de la prestation : "+ prix);
	}
	
	
	
}
