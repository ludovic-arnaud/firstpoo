package firstPoo;

import entites.Ado;
import entites.Enfant;
import entites.Majeur;
import view.Popup;

public class Principal {

	public static void main(String[] args) {

		int age = Popup.askAge(0, 120);

		if (age <= 12) {
			Enfant unEnfant = new Enfant();
			unEnfant.setNom(Popup.askString("Nom"));
			unEnfant.setPrenom(Popup.askString("Prénom"));
			unEnfant.setAge(age);
			unEnfant.setEcole(Popup.askString("Ecole"));
			unEnfant.setVelo(Popup.askBoolean("Vélo"));
			Popup.showInfos(unEnfant.toString());
		} else if (age >= 18) {
			Majeur unMajeur = new Majeur();
			unMajeur.setNom(Popup.askString("Nom"));
			unMajeur.setPrenom(Popup.askString("Prénom"));
			unMajeur.setAge(age);
			unMajeur.setVote(Popup.askBoolean("Carte d'électeur"));
			Popup.showInfos(unMajeur.toString());
		} else {
			Ado unAdo = new Ado();
			unAdo.setNom(Popup.askString("Nom"));
			unAdo.setPrenom(Popup.askString("Prénom"));
			unAdo.setAge(age);
			unAdo.setEcole(Popup.askString("Ecole"));
			unAdo.setPortable(Popup.askBoolean("Portable"));
			Popup.showInfos(unAdo.toString());
		}

		// instance de Personne
//		Personne unePersonne = new Personne();
//		unePersonne.setNom("Dupond");
//		unePersonne.setPrenom("Alain");
//		unePersonne.setAge(25);
//		System.out.println(unePersonne.toString());

		// autre instance de Personne
//		Personne nicolas = new Personne("Escaich", "Nicolas", 34);
//		System.out.println(nicolas.toString());
//		nicolas.setNom("Machin");
//		System.out.println("\n"+nicolas.getPrenom()+"\n");
//		System.out.println(nicolas.toString());

		// instance de Majeur
//		Majeur maj = new Majeur("Martin","Paul",40,true);	
//		System.out.println(maj.toString()+maj.travailler());

		// instance de Mineur
//		Mineur min = new Mineur("Duran","Kevin",10,"Victor Hugo");
//		System.out.println(min.toString());

		// instance de Ado
//		Ado ado = new Ado("Duran","Jessica",14,"Victor Hugo",true);
//		System.out.println(ado.toString()+ado.conduireScooter()+ado.grandir());
//		
//		Ado ado2 = new Ado();
//		ado2.setNom("azerty");

		// instance d'Enfant
//		Enfant enf = new Enfant("Duran","Max",9,"Victor Hugo",true);
//		System.out.println(enf.toString()+enf.jouer()+enf.grandir());

	}

}
