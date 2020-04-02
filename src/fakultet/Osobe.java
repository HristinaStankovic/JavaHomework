package fakultet;

public class Osobe {
	
	protected String ime;
	protected String prezime;
	private String adresa;
	private String brLk;
	private String jmbg;
	public Osobe(String ime, String prezime, String adresa, String brLk, String jmbg) {
		
		this.ime = ime;
		this.prezime = prezime;
		this.adresa = adresa;
		this.brLk = brLk;
		this.jmbg = jmbg;
	}
	public String getIme() {
		return ime;
	}
	
	public String getPrezime() {
		return prezime;
	}
	
	public String getAdresa() {
		return adresa;
	}
	
	public String getBrLk() {
		return brLk;
	}
	
	public String getJmbg() {
		return jmbg;
	}
	

	
	
}
