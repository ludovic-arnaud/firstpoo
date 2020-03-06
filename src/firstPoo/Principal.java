package firstPoo;

import entites.Ado;
import entites.Enfant;
import entites.Majeur;
//import entites.Mineur;
//import entites.Personne;
import controller.Read;
import view.popup;

public class Principal {

	public static void main(String[] args) {
		
		Read.openScanner();

		int age = Read.askAge(0, 120);

		if (age <= 12) {
			Enfant unEnfant = new Enfant();
			unEnfant.setNom(Read.askString("Nom"));
			unEnfant.setPrenom(Read.askString("Prénom"));
			unEnfant.setAge(age);
			unEnfant.setEcole(Read.askString("Ecole"));
			unEnfant.setVelo(Read.askBoolean("Vélo"));
			popup.showInfos(unEnfant.toString());
		} else if (age >= 18) {
			Majeur unMajeur = new Majeur();
			unMajeur.setNom(Read.askString("Nom"));
			unMajeur.setPrenom(Read.askString("Prénom"));
			unMajeur.setAge(age);
			unMajeur.setVote(Read.askBoolean("Carte d'électeur"));
			popup.showInfos(unMajeur.toString());
		} else {
			Ado unAdo = new Ado();
			unAdo.setNom(Read.askString("Nom"));
			unAdo.setPrenom(Read.askString("Prénom"));
			unAdo.setAge(age);
			unAdo.setEcole(Read.askString("Ecole"));
			unAdo.setPortable(Read.askBoolean("Portable"));
			popup.showInfos(unAdo.toString());
		}
		
		Read.closeScanner();

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
