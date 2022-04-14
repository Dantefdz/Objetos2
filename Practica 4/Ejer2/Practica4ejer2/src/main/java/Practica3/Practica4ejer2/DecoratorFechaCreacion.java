package Practica3.Practica4ejer2;

public class DecoratorFechaCreacion extends FileDecorator {

	public DecoratorFechaCreacion(FileOO2 c) {
		super(c);
	}

	@Override
	public String print() {
		return this.component.getFechaCreacion().toString();
	}


}