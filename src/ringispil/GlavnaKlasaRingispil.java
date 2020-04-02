package ringispil;

public class GlavnaKlasaRingispil {

	public static void main(String[] args) {

		
		Ringispil r2= new Ringispil(10);
		r2.dodajCoveka(new Covek("Mirko"));
		r2.dodajCoveka(new Covek("Brka", 1000));
		Covek maja= new Covek("Maja", 2000);
		System.out.println(r2.dodajCoveka(maja));
		r2.naplata();
		Voznja v1 = new Voznja("Ringispil", 200, 5);
		v1.dodajCoveka(maja);
		v1.naplata();
		v1.ukloniCoveka(maja);
		v1.dodajCoveka(maja);
		
		
		

	}

}
