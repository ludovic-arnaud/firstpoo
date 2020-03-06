package view;

import javax.swing.JOptionPane;

public class Popup {

	
	public static String[] choix = { "Oui", "Non" };
	

	// Demander l'âge
	public static int askAge(int min, int max) {
		boolean ok = false;
		int i = 0;

		do {
			try {
				String var = JOptionPane.showInputDialog(null, "Saisir votre âge (entre 0 et 120)", "AGE",
						JOptionPane.QUESTION_MESSAGE);
				i = Integer.parseInt(var);
				if (i >= min && i <= max) {
					ok = true;
				} else {
					JOptionPane.showMessageDialog(null, "Saisir une nouvelle valeur entre 0 et 120", "ERREUR",
							JOptionPane.ERROR_MESSAGE);
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Saisir une nouvelle valeur entre 0 et 120", "ERREUR",
						JOptionPane.ERROR_MESSAGE);
			}

		} while (ok == false);

		return i;
	}

	// Demander String
	public static String askString(String type) {
		String var = JOptionPane.showInputDialog(null, "Saisir votre " + type, type, JOptionPane.QUESTION_MESSAGE);
		return var;
	}

	// Demander boolean
	public static boolean askBoolean(String type) {
		boolean b = false;
		int i = JOptionPane.showOptionDialog(null, // fenêtre parente
				"Avez-vous un(e) " + type + " ?", // corps du dialogue
				type, // titre du dialogue
				JOptionPane.DEFAULT_OPTION, // type de dialogue
				JOptionPane.QUESTION_MESSAGE, // type d'icône
				null, // icône optionnelle
				choix, // boutons (renvoie au tableau choix)
				choix[1]); // choix par défaut
		if (i == 0) {
			b = true;
		}
		return b;
	}
	
	public static void showInfos(String str) {
		JOptionPane.showMessageDialog(null, str, "Récapitulatif", JOptionPane.INFORMATION_MESSAGE);
	}

}
