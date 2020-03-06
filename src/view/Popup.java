package view;

import javax.swing.JOptionPane;

public class Popup implements Display {

	// Properties
	private String[] choice = { "Oui", "Non" };
	private JOptionPane popup;

	// Constructor
	public Popup() {
		this.popup = new JOptionPane();
	}

	/*
	 * Méthodes de saisie
	 */

	// Saisie de l'âge
	@SuppressWarnings("static-access")
	@Override
	public int askAge(int min, int max) {
		boolean ok = false;
		int i = 0;

		do {
			try {
				String var = this.popup.showInputDialog(null, "Saisir votre âge (entre 0 et 120)", "AGE",
						JOptionPane.QUESTION_MESSAGE);
				i = Integer.parseInt(var);
				if (i >= min && i <= max) {
					ok = true;
				} else {
					this.popup.showMessageDialog(null, "Saisir une nouvelle valeur entre 0 et 120", "ERREUR",
							JOptionPane.ERROR_MESSAGE);
				}
			} catch (Exception e) {
				this.popup.showMessageDialog(null, "Saisir une nouvelle valeur entre 0 et 120", "ERREUR",
						JOptionPane.ERROR_MESSAGE);
			}

		} while (ok == false);

		return i;
	}

	// Saisie d'un String
	@SuppressWarnings("static-access")
	@Override
	public String askString(String type) {
		String var = this.popup.showInputDialog(null, "Saisir votre " + type, type, JOptionPane.QUESTION_MESSAGE);
		return var;
	}

	// Saisie d'un booléen
	@SuppressWarnings("static-access")
	@Override
	public boolean askBoolean(String type) {
		boolean b = false;
		int i = this.popup.showOptionDialog(null, // fenêtre parente
				"Avez-vous un(e) " + type + " ?", // corps du dialogue
				type, // titre du dialogue
				JOptionPane.DEFAULT_OPTION, // type de dialogue
				JOptionPane.QUESTION_MESSAGE, // type d'icône
				null, // icône optionnelle
				choice, // boutons (renvoie au tableau choix)
				choice[1]); // choix par défaut
		if (i == 0) {
			b = true;
		}
		return b;
	}

	/*
	 * Méthodes d'affichage
	 */

	// Affichage des informations saisies dans un popup
	@SuppressWarnings("static-access")
	@Override
	public void showInfos(String str) {
		this.popup.showMessageDialog(null, str, "Récapitulatif", JOptionPane.INFORMATION_MESSAGE);
	}

}
