package Practica3.Practica4ejer2;

public class DecoratorFechaModificacion extends FileDecorator {

	public DecoratorFechaModificacion(FileOO2 c) {
		super(c);
	}

	@Override
	public String print() {
		return this.component.getFechaModificacion().toString();
	}


}