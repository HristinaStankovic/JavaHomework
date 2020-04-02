package planinarenje;

public class Alpinista extends Planinar {
		private Alpinista partner=null;
		
	

	public Alpinista(String ime, String prezime) {
		super(ime, prezime);


	}
	
	public void setPartnera(Alpinista buduciPartner) {
		if(this.partner==null && buduciPartner.partner==null) {
			this.partner=buduciPartner;
			buduciPartner.partner=this;
		}
		
		
	}
	
	
	public void ukloniPartner() {
		if(partner!=null) {
			partner.partner=null;
			partner=null;
		}
		
	}
	


	@Override
	public String rezPenjanja(Planina p) {
		if (p.getVisina() > 3000 || partner != null)
			return "uspesno";
		else
			return "neuspesno";
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("A_");
		return sb.toString() + super.toString();

	}

}
