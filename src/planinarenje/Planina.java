package planinarenje;

import java.util.ArrayList;
import java.util.List;

public class Planina {
	private String imePlanine;
	private int visina;
	private List<Planinar> planinari;



	public Planina(String imePlanine, int visina) {
		super();
		this.imePlanine = imePlanine;
		this.visina = visina;
		planinari=new ArrayList<>();
	}

	public String getIme() {
		return imePlanine;
	}

	public int getVisina() {
		return visina;
	}
	
	public void addPlaninar(Planinar p) {
		planinari.add(p);
	}
	
	public void removePlaninar(Planinar p) {
		planinari.remove(p);
	}
	
	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append('[');

		for(Planinar p: planinari) {
			sb.append(p);
			
		}
		sb.append(']');
		return sb.toString();
		
		
	}
	
	

}
