package entites;

public class Majeur extends Personne {
	
	private boolean vote;
	
	// constructeurs
	public Majeur() {
		
	}
	
	public Majeur(String nom, String prenom, int age, boolean vote) {
		super(nom,prenom,age);
		this.vote = vote;
	}
	
	// Methodes
	public void conduireUneVoiture(){
		System.out.println("je conduis");
	}

	// Accesseurs
	public boolean isVote() {
		return vote;
	}

	public void setVote(boolean vote) {
		this.vote = vote;
	}
	
	public String toString() {
		return super.toString() + " " + (this.isVote() ? "vote" : "ne vote pas");
	}

	public String travailler() {
		return " je travaille";
	}
}
