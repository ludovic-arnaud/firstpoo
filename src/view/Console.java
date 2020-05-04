package view;

import java.util.Scanner;

public class Console implements Display {
	
	// Properties
	private Scanner sc;
	
	// Constructor
	public Console () {
		this.sc = new Scanner(System.in);
	}
	
	// Destructor
	public void finalyse() {
		this.sc.close();
	}
	
	/*
	 * M�thodes de saisie
	 */

	// Saisie de l'age
	@Override
	public int askAge(int min, int max) {
		boolean ok = false;
		int i = 0;
		String request = "Indiquez votre âge (valeur entre "+min+" et "+max+")";
		String err = "Erreur, saisir une nouvelle valeur entre "+min+" et "+max;

		do {
			try {
				this.showInfos(request);
				i = this.sc.nextInt();
				this.sc.nextLine();
				if (i >= min && i <= max) {
					ok = true;
				} else {
					this.showInfos(err);
				}
			} catch (Exception e) {
				this.showInfos(err);
				this.sc.nextLine();				
			}

		} while (ok == false);

		return i;
	}

	// Saisie d'un String
	@Override
	public String askString(String type) {
		String request = "Indiquez votre "+type;
		this.showInfos(request);
		String str = this.sc.nextLine();
		return str;
	}

	// Saisie d'un bool�en
	@Override
	public boolean askBoolean(String type) {
		boolean b = false;
		boolean ok = false;
		char c;
		String request = "Possédez-vous un(e) "+type;
		String err = "Erreur, saisir une nouvelle valeur, soit O ou N";
		
		do {
			try {
				this.showInfos(request);
				c = this.sc.next().charAt(0);
				if (c == 'o' || c == 'O') {
					b = true;
					ok = true;
				} else if (c == 'n' || c == 'N') {
					b = false;
					ok = true;					
				} else {
					this.showInfos(err);
				}
			} catch (Exception e) {
				this.showInfos(err);
				this.sc.nextLine();				
			}

		} while (ok == false);

		return b;
		
	}

	/*
	 * M�thodes d'affichage
	 */
	
	// Affichage des informations saisies dans la console
	@Override
	public void showInfos(String str) {
		System.out.println(str);	
	}
	
}
