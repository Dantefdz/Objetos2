package Practica3.Practica4ejer2;

public class DecoratorName extends FileDecorator {

	public DecoratorName(FileOO2 c) {
		super(c);
	}

	@Override
	public String print() {
		return this.component.getNombre();
	}


}