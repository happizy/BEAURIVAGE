
public class PersonneSuplementaire extends Prestation{

	private int prix;
	private int age;
	
	public PersonneSuplementaire(int age) {
		super();
		this.age = age;
		if (age < 2) {
			this.prix = 0;			
		}
		else if(age > 2 && age < 7) {
			this.prix = 14;
					
		}
		else {
			this.prix = 28;
		}
			
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public void consulterPrestation() {
		System.out.println("le prix de cette préstation est de : " + this.getPrix());
	}
	
	
}
