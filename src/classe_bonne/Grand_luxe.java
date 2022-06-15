
public class Grand_luxe extends Categorie{

	private static int ID = 2;
	
	public Grand_luxe(int superficie,int capacite,int prix) {
		super(superficie, capacite, prix);
	}

	public static int getID() {
		return ID;
	}
	
}
