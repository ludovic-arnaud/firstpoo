package entites;

// Class abstraite
public abstract class Mineur extends Personne{
	
	// propriétés
	private String ecole;
	
	// Constructeurs
	public Mineur() {
		
	}
	
	public Mineur (String nom, String prenom, int age, String ecole) {
		super(nom,prenom,age);
		this.ecole = ecole;
	}

	// Accesseurs
	public String getEcole() {
		return ecole;
	}

	public void setEcole(String ecole) {
		this.ecole = ecole;
	}
	
	public String toString() {
		return super.toString() + " " + this.getEcole();
	}
	
	// methode abstraite
	public abstract String grandir();
	
	
}
