
public class Standard extends Categorie{

	private static int ID = 1;
	
	public Standard(int superficie,int capacite,int prix) {
		super(superficie, capacite, prix);
	}

	public static int getID() {
		return ID;
	}
	
}
