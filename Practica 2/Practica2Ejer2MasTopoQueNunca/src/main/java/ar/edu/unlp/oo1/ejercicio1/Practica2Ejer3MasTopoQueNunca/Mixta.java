package ar.edu.unlp.oo1.ejercicio1.Practica2Ejer3MasTopoQueNunca;

import java.util.ArrayList;

public class Mixta extends Topografia{
	private ArrayList<Topografia> topografias;
	
	public Mixta() {
		super(0);
		this.topografias = new ArrayList<Topografia>();
	}
	
	public void agregarTopografia(Topografia t) throws Exception{
		if(topografias.size() < 4) this.topografias.add(t);
	}
	
	public ArrayList<Topografia> getTopografias(){
		return this.topografias;
	}
	
	public double getProporcion() {
		return this.topografias.stream()
				.mapToDouble(t -> t.getProporcion())
				.sum() / this.topografias.size();
	}
	
	public boolean esIgualA(Topografia m) {
		return this.topografias.equals(m.getTopografias());
	}
}