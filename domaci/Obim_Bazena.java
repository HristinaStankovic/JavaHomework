package itbootcamp.domaci;

import java.util.Scanner;

public class Obim_Bazena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite duzinu stranice a bazena (kvadra): ");
		int a = sc.nextInt();
		
		System.out.println("Unesite duzinu stranice b bazena (kvadra): ");
		int b = sc.nextInt();
		
		System.out.println("Unesite duzinu stranice c bazena (kvadra): ");
		int c = sc.nextInt();
		
		System.out.println("Obim bazena je: ");
		int obim_bazena = 4*a + 4*b + 4*c;
		
		System.out.println(obim_bazena);
	}

}
