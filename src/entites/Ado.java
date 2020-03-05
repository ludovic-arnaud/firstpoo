package entites;

public class Ado extends Mineur {

	// propriétés
	private boolean portable;

	// constructeurs
	public Ado() {
	}

	public Ado(String nom, String prenom, int age, String ecole, boolean portable) {
		super(nom, prenom, age, ecole);
		this.portable = portable;
	}

	// getters setters
	public boolean isPortable() {
		return portable;
	}

	public void setPortable(boolean portable) {
		this.portable = portable;
	}

	// methodes
	public String toString() {
		return super.toString() + " " + (this.isPortable() ? "Possède un portable" : "Ne possède pas de portable");
	}

	public String conduireScooter() {
		return " je conduis un scooter";
	}

	@Override
	public String grandir() {
		return " je bois du lait";
	}

}
