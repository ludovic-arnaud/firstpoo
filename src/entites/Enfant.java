package entites;

public class Enfant extends Mineur {

	private boolean velo;
	
	public Enfant() {
		
	}
	
	public Enfant(String nom, String prenom, int age, String ecole, boolean velo) {
		super(nom,prenom,age,ecole);
		this.setVelo(velo);
	}

	public boolean isVelo() {
		return velo;
	}

	public void setVelo(boolean velo) {
		this.velo = velo;
	}
	
	// methodes
	public String toString() {
		return super.toString() + " " + (this.isVelo() ? "j'ai un v�lo" : "je n'ai pas de v�lo");
	}
	
	public String jouer() {
		return " je joue";
	}

	@Override
	public String grandir() {
		return " je bois de l'eau";
	}

}
