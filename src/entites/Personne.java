package entites;

public class Personne {
	
	// Propriétés
	private String nom;
	private String prenom;
	private int age;
	
	// Constructeurs
	public Personne() {
		
	}
	
	public Personne(String nom, String prenom, int age) {
		this.setNom(nom);
		this.setPrenom(prenom);
		this.age = age;
	}
	
	public Personne(String nom, String prenom0) {
		this.setNom(nom);
		
		this.setPrenom(prenom);
	}
	
	// ACCESSEURS
	public String getNom() {
		return nom;
	}
	public void setNom(String monnom) {
		this.nom = monnom.toUpperCase();
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

	public String toString() {
		return this.getNom() + " " + this.getPrenom() + " " + this.getAge();
	}
}
