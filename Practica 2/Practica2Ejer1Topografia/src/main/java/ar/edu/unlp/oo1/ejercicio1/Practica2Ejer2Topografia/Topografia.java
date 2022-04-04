package ar.edu.unlp.oo1.ejercicio1.Practica2Ejer2Topografia;

public abstract class Topografia {
	private int proporcion;

	public double getProporcion() {
		return proporcion;
	}

	public Topografia(int proporcion) {
		this.proporcion = proporcion;
	}

	protected abstract Object getTopografias();
	
	
}