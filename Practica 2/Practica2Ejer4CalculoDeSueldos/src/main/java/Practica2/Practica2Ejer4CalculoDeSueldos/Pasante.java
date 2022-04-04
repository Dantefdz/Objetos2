package Practica2.Practica2Ejer4CalculoDeSueldos;

public class Pasante extends Empleado {
	private int examenesRendidos;
	
	public Pasante(int e) {
		this.setExamenesRendidos(e);
	}
	
	@Override
	public double calcularBasico() {
		return 20000;
	}

	@Override
	public double calcularAdicional() {
		return 2000 * this.getExamenesRendidos();
	}

	public int getExamenesRendidos() {
		return examenesRendidos;
	}

	public void setExamenesRendidos(int examenesRendidos) {
		this.examenesRendidos = examenesRendidos;
	}

}