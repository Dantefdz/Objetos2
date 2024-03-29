package Practica2.Practica2Ejer4CalculoDeSueldos;

public abstract class Empleado {

	public abstract double calcularBasico();
	public abstract double calcularAdicional();
	
	public double calcularDescuento() {
		return (this.calcularBasico() * 0.13) + (this.calcularAdicional() * 0.05) ;
	}
	
	public double sueldo() {
		return this.calcularBasico() + this.calcularAdicional() - this.calcularDescuento();
	}


}