
public class Simple extends Categorie{

	private static int ID = 3;
	
	public Simple(int superficie,int capacite,int prix) {
		super(superficie, capacite, prix);
	}

	public static int getID() {
		return ID;
	}
	
}
