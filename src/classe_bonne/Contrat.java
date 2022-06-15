import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Contrat {

	private String dateArrive;
	private String dateDepart;
	private int accompte;
	private int caution;
	private String courier;
	private HashMap<Contrat, Integer> etatContrat;
	private HashMap<Contrat, Integer> etatCaution;
	private String souhaitClient;
	private HashMap<Contrat, Integer> statutContrat;
	private Client client;
	private ArrayList<Prestation> prestation;
	
	public Contrat(String dateArrive, String dateDepart, int accompte, int caution, String courier, String souhaitClient,Client client) {
		this.dateArrive = dateArrive;
		this.dateDepart = dateDepart;
		this.accompte = accompte;
		this.caution = caution;
		this.courier = courier;
		this.etatContrat = new HashMap<>();
		this.etatCaution = new HashMap<>();
		this.souhaitClient = souhaitClient;
		this.statutContrat = new HashMap<>();
		this.client = client;
	}

	public String getDateArrive() {
		return dateArrive;
	}

	public void setDateArrive(String dateArrive) {
		this.dateArrive = dateArrive;
	}
	
	public int getNoClient() {
		return client.getNoClient();
	}

	public String getDateDepart() {
		return dateDepart;
	}

	public void setDateDepart(String dateDepart) {
		this.dateDepart = dateDepart;
	}

	public int getAccompte() {
		return accompte;
	}

	public int getCaution() {
		return caution;
	}

	public String getCourier() {
		return courier;
	}

	public void setCourier(String courier) {
		this.courier = courier;
	}

	public HashMap<Contrat, Integer> getEtatContrat() {
		return etatContrat;
	}

	public void setEtatContrat(HashMap<Contrat, Integer> etatContrat) {
		this.etatContrat = etatContrat;
	}

	public HashMap<Contrat, Integer> getEtatCaution() {
		return etatCaution;
	}

	public void setEtatCaution(HashMap<Contrat, Integer> etatCaution) {
		this.etatCaution = etatCaution;
	}

	public String getSouhaitClient() {
		return souhaitClient;
	}

	public void setSouhaitClient(String souhaitClient) {
		this.souhaitClient = souhaitClient;
	}

	public HashMap<Contrat, Integer> getStatutContrat() {
		return statutContrat;
	}

	public void setStatutContrat(HashMap<Contrat, Integer> statutContrat) {
		this.statutContrat = statutContrat;
	}

	public void enregistrerAccompte(int ac) {
		this.accompte = ac;
	}
	
	public void afficherCourrier() {
		//Pas notre partie
	}
	
	public void afficherEtEnregistrerFacture() {
		//Pas notre partie
	}
	
	public void enregistrerCaution(int caution) {
		this.caution = caution;
	}
	
	public void afficherContrat() {
		System.out.println("Date d'arrivé : " + this.getDateArrive() + "Date de départ : " +this.getDateDepart() + "L'acompte est de : "+this.getAccompte() + "La caution est de : "+ this.getCaution() + this.getCourier() + this.getEtatContrat() + this.getStatutContrat() + this.getSouhaitClient());
	}
	
	public void ajoutPrestation(Prestation presta) {
		this.prestation.add(presta);
	}
	
	public void suppPrestation(int i) {
		this.prestation.remove(i);
	}
	
	public void rechercherEtModifierContrat() {
		
	}
	
}
