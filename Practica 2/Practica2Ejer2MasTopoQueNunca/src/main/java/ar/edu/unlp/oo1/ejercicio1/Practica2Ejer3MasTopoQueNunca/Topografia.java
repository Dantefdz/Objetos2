package ar.edu.unlp.oo1.ejercicio1.Practica2Ejer3MasTopoQueNunca;

public abstract class Topografia {
	private double proporcion;

	public double getProporcion() {
		return proporcion;
	}

	public Topografia(double proporcion) {
		this.proporcion = proporcion;
	}

	protected abstract Object getTopografias();
	
	
}