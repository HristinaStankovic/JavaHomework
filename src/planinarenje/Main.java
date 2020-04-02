package planinarenje;

public class Main {
	
	public static void main(String[] args) {
		
		Planinar p1=new Alpinista("Nikola","Stojanovic");
		Planinar p2=new Alpinista("Niola","Sojanovic");
		Alpinista a= new Alpinista("Dusan","Bobi");
		Alpinista a2= new Alpinista("Duusan","Boobi");
		Planina pl1=new Planina("Morija",1100);
		a=(Alpinista) p1;
		a2=(Alpinista) p2;
		
		pl1.addPlaninar(p1);
		pl1.addPlaninar(p2);
		
		
		a.setPartnera(a2);
		
		System.out.println(p1.toString());
		System.out.println(a.rezPenjanja(pl1));
		System.out.println(pl1.toString());
	}

}
