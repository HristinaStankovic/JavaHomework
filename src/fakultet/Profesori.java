package fakultet;

public class Profesori extends Osobe {

	private String temaDr;
	public Profesori(String ime, String prezime, String adresa, String brLk, String jmbg,String temaDr) {
		super(ime, prezime, adresa, brLk, jmbg);
		// TODO Auto-generated constructor stub
		this.temaDr=temaDr;
	}
	public String getTemaDr() {
		return temaDr;
	}
	@Override
	public String toString() {
		return "Profesor" + " " + ime + " " + prezime + ","+ "temaDr=" + temaDr+".";
	}
	
	
	
	
	

}
