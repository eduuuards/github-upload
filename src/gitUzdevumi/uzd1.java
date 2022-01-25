package gitUzdevumi;

import javax.swing.JOptionPane;

public class uzd1 {

	public static void main(String[] args) {
		String[][] cilveki = null;
		String skaits;
		
		skaits = JOptionPane.showInputDialog(null, "Cik cilvekus velies ievadit");

		for(int i=0; i<skaits.length(); i++) {
			for(int j=0; j<skaits.length(); j++) {
			cilveki[i][i] = JOptionPane.showInputDialog(null, "Ka sauc "+i+" cilveku");
			
			}
		}
		
	}

}
