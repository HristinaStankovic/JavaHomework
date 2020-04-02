package itbootcamp.domaci;

import java.util.Arrays;
import java.util.Scanner;

public class PaidromMetode {

	private static int duzina;
	public static int[] niz = new int[duzina];
	public static int[] referentni = new int[duzina];
	static int clan_niza;

	public static int[] kreirajNiz(int clan_niza) {
		for (int i = 1; i < duzina; i++) {
			System.out.println("Unesite " + (i + 1) + ". broj: ");
			niz[i] = clan_niza;
			System.out.print("Niz cine clanovi: ");
			for (int j = 1; i < duzina; j++)
				System.out.print(niz[j]);

		}

		return niz;
	}

	public static int[] kreirajReferentniNiz(int duzina) {
		System.out.print("Niz ispisan unazad je : ");
		int i;
		for (i = 0; i < duzina/2; i++)
			System.out.print(referentni[i]);
		niz[i] = clan_niza;
		referentni[(duzina - 1) - i] = clan_niza;
		return referentni;

	}

	public void ispisiClanoveObaNiza() {
		System.out.println("");
		System.out.print("Niz cine clanovi: ");
		for (int i = 0; i < duzina; i++)
			System.out.print(niz[i]);

		System.out.println("");
		System.out.print("Niz ispisan unazad je : ");
		for (int i = 0; i < duzina; i++)
			System.out.print(referentni[i]);

	}

	public static int uporediNizove() {
		System.out.println("");
		if (Arrays.equals(niz, referentni))
			System.out.println("Jeste palindrom");
		else
			System.out.println("Nije palindrom");
		return duzina;
		

	}
	
	public static void main (String[] args) { ;
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Unesite broj elemenata prvog niza: ");
			int niz[]=kreirajNiz(sc.nextInt());
			System.out.println("Unesi brojelemenata drugog niza: ");
			int referentni[]=kreirajReferentniNiz(sc.nextInt());
			
			System.out.println(Arrays.toString(niz));

			
			uporediNizove();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
}
