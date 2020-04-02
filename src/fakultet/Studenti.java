package fakultet;

public class Studenti extends Osobe{

	private int godina;
	private int brIndeksa;

	public Studenti(String ime, String prezime, String adresa, String brLk, 
			String jmbg,int brIndeksa,int godina) {
		super(ime, prezime, adresa, brLk, jmbg);
		// TODO Auto-generated constructor stub
	this.brIndeksa=brIndeksa;
	this.godina=godina;
	
	}

	public int getGodina() {
		return godina;
	}
	

	public int getBrIndeksa() {
		return brIndeksa;
	}
  
}
