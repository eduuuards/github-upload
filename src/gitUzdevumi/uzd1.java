package gitUzdevumi;

import java.util.Scanner;

import javax.swing.JOptionPane;


public class uzd1 {

	public static void main(String[] args) {
		int studSk, kritSk;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Cik studentiem aprekinasi gala vertejumu");
			studSk = scan.nextInt();
		}while(studSk<1);
		String [] studenti = new String[studSk];

		do {
			System.out.println("Kads bus kriteriju skaits?");
			kritSk = scan.nextInt();
		}while(kritSk<1);
		String[] kriteriji = new String[kritSk];
		int[] kriterijaSvars = new int[kritSk];
		int [][] kriterijaVertejums = new int[studSk][];
		double[] semestraVertejums = new double[studSk];
		
		//Ievada studentu vardus un uzvardus
		for(int i=0; i<studenti.length; i++) {
			System.out.println("Ievadi "+(i+1)+". studentu");
			studenti[i] = scan.next();
			
		}	
		//define kriterijus
		int maxSvars=100;
		for(int i=0; i<kriteriji.length; i++) {
			System.out.println("Ievadi "+(i+1)+". kriteriju");
			kriteriji[i] = scan.next();
			
			do {
				System.out.println("Ievadi "+kriteriji[i]+" svaru");
				kriterijaSvars[i] = scan.nextInt();
			}while(kriterijaSvars[i]>100 || kriterijaSvars[i]<1);
			maxSvars -=kriterijaSvars[i];
		}
		}
}
