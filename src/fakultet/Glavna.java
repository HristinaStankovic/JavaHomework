package fakultet;

public class Glavna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Osobe o1 = new Osobe("Hris", "Stan", "Bg", "3657845", "654645");
        
		Studenti s1 = new Studenti("Ivan", "Manic", "Bg", "54545", "667", 5, 25);
		Profesori p1 =new Profesori("Teona", "Tomic", "BG", "54353", "4554", "Doplerov efekat");
		
		System.out.println(s1.getBrIndeksa());
		System.out.println(o1.getPrezime());
		System.out.println(p1.toString());
		
	}

}
