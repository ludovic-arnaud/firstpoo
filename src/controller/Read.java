package controller;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Read {

	public static Scanner scan;
	public static String[] choix = { "Oui", "Non" };
	
	// Open scanner
	public static void openScanner() {
		scan = new Scanner(System.in);
	}
	
	// Close scanner
	public static void closeScanner() {
		scan.close();
	}

	// Scanner pour demander l'âge
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

	// Scanner de String
	public static String askString(String type) {
		String var = JOptionPane.showInputDialog(null, "Saisir votre " + type, type, JOptionPane.QUESTION_MESSAGE);
		return var;
	}

	// Scanner de boolean
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

}
