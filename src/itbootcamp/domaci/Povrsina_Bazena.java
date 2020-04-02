package itbootcamp.domaci;

import java.util.Scanner;

public class Povrsina_Bazena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
		
        System.out.println("Unesite duzinu stranice a bazena (kvadra): ");
        int a = sc.nextInt();
        
        System.out.println("Unesite duzinu stranice b bazena (kvadra): ");
        int b = sc.nextInt();
        
        System.out.println("Unesite duzinu stranice c bazena (kvadra): ");
        int c = sc.nextInt();
        
        System.out.println("Povrsina bazena je: ");
        int povrsina_bazena = 2*a*b + 2*a*c + 2*b*c;
        
        System.out.println(povrsina_bazena);
	}

}
