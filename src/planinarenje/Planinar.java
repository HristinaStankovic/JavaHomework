package planinarenje;

public abstract class Planinar {
	private String ime;
	private String prezime;
	private int UID = 0;
	private int id;

	public Planinar(String ime, String prezime) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.id = ++UID;
	}

	public abstract String rezPenjanja(Planina p);

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(ime).append('-').append(id);
		return sb.toString();

	}



}
