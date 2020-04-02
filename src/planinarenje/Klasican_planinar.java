package planinarenje;

public class Klasican_planinar extends Planinar {


	public Klasican_planinar(String ime, String prezime) {
		super(ime, prezime);
	}

	@Override
	public String rezPenjanja(Planina p) {
		if(p.getVisina()<=2000)
			return "uspesno";
		else
			return "nesupesno";
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("K_");
		return sb.toString() + super.toString();

	}

}
