package ar.edu.unlp.oo1.ejercicio1.Practica2Ejer2Topografia;


public class Agua extends Topografia{
		
		public Agua(int proporcion) {
			super(proporcion);
		}
		
		public double getProporcion() {
			return super.getProporcion();
		}

		@Override
		protected Object getTopografias() {
			return this;
		}


}
