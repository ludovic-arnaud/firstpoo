package firstPoo;

import entites.Ado;
import entites.Enfant;
import entites.Majeur;
//import view.Console;
import view.Popup;

public class Principal {

	public static void main(String[] args) {

		// Instanciation d'un objet Popup pour utiliser ses m�thodes
		Popup popup = new Popup();
		
		// Instanciation d'un objet Console pour utiliser ses m�thodes
		//Console popup = new Console();

		// On demande en premier � l'utilisateur de saisir son age
		int age = popup.askAge(1, 120);

		// En fonction de l'age saisie, on d�termine si c'est un Majeur, un Enfant ou un
		// Ado
		if (age <= 12) {
			// Si age<=12 on cr�e un objet Enfant
			Enfant unEnfant = new Enfant();
			unEnfant.setNom(popup.askString("Nom"));
			unEnfant.setPrenom(popup.askString("Prénom"));
			unEnfant.setAge(age);
			unEnfant.setEcole(popup.askString("Ecole"));
			unEnfant.setVelo(popup.askBoolean("Vélo"));
			popup.showInfos(unEnfant.toString());
		} else if (age >= 18) {
			// Si age>=18 on cr�e un objet Majeur
			Majeur unMajeur = new Majeur();
			unMajeur.setNom(popup.askString("Nom"));
			unMajeur.setPrenom(popup.askString("Prénom"));
			unMajeur.setAge(age);
			unMajeur.setVote(popup.askBoolean("Carte d'électeur"));
			popup.showInfos(unMajeur.toString());
		} else {
			// Si age>12 et <18 on cr�e un objet Ado
			Ado unAdo = new Ado();
			unAdo.setNom(popup.askString("Nom"));
			unAdo.setPrenom(popup.askString("Prénom"));
			unAdo.setAge(age);
			unAdo.setEcole(popup.askString("Ecole"));
			unAdo.setPortable(popup.askBoolean("Portable"));
			popup.showInfos(unAdo.toString());
		}
		
		// M�thode � appeler pour fermer le Scanner si on travaille avec un objet Console
		// popup.finalyse();

	}

}
