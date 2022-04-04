package ar.edu.unlp.oo1.ejercicio1.Practica2Ejer3MasTopoQueNunca;


public class Tierra extends Topografia{

	public Tierra(int proporcion) {
		super(proporcion);
	}
	
	public double  getProporcion() {
		return super.getProporcion();
	}

	@Override
	protected Object getTopografias() {
		return this;
	}


}