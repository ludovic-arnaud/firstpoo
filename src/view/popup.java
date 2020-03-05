package view;

import javax.swing.JOptionPane;

public class popup {

	public static void showInfos(String str) {
		JOptionPane.showMessageDialog(null, str, "Récapitulatif", JOptionPane.INFORMATION_MESSAGE);
	}

}
