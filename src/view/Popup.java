package view;

import javax.swing.JOptionPane;

public class Popup {

	
	public static String[] choix = { "Oui", "Non" };
	

	// Demander l'�ge
	public static int askAge(int min, int max) {
		boolean ok = false;
		int i = 0;

		do {
			try {
				String var = JOptionPane.showInputDialog(null, "Saisir votre �ge (entre 0 et 120)", "AGE",
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
		int i = JOptionPane.showOptionDialog(null, // fen�tre parente
				"Avez-vous un(e) " + type + " ?", // corps du dialogue
				type, // titre du dialogue
				JOptionPane.DEFAULT_OPTION, // type de dialogue
				JOptionPane.QUESTION_MESSAGE, // type d'ic�ne
				null, // ic�ne optionnelle
				choix, // boutons (renvoie au tableau choix)
				choix[1]); // choix par d�faut
		if (i == 0) {
			b = true;
		}
		return b;
	}
	
	public static void showInfos(String str) {
		JOptionPane.showMessageDialog(null, str, "R�capitulatif", JOptionPane.INFORMATION_MESSAGE);
	}

}
