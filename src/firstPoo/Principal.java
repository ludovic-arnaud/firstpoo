package firstPoo;

import entites.Ado;
import entites.Enfant;
import entites.Majeur;
//import entites.Mineur;
import entites.Personne;

public class Principal {

	public static void main(String[] args) {
		
		// instance de Personne
		Personne unePersonne = new Personne();
		unePersonne.setNom("Dupond");
		unePersonne.setPrenom("Alain");
		unePersonne.setAge(25);
		System.out.println(unePersonne.toString());
		
		// autre instance de Personne
		Personne nicolas = new Personne("Escaich", "Nicolas", 34);
		System.out.println(nicolas.toString());
		nicolas.setNom("Machin");
		System.out.println("\n"+nicolas.getPrenom()+"\n");
		System.out.println(nicolas.toString());
		
		// instance de Majeur
		Majeur maj = new Majeur("Martin","Paul",40,true);	
		System.out.println(maj.toString()+maj.travailler());
		
		// instance de Mineur
//		Mineur min = new Mineur("Duran","Kevin",10,"Victor Hugo");
//		System.out.println(min.toString());
		
		// instance de Ado
		Ado ado = new Ado("Duran","Jessica",14,"Victor Hugo",true);
		System.out.println(ado.toString()+ado.conduireScooter()+ado.grandir());
		
		Ado ado2 = new Ado();
		ado2.setNom("azerty");
		
		
		// instance d'Enfant
		Enfant enf = new Enfant("Duran","Max",9,"Victor Hugo",true);
		System.out.println(enf.toString()+enf.jouer()+enf.grandir());
		
	}
	
	

}
