package Practica3.Practica4ejer2;

public class DecoratorPermisos extends FileDecorator {

	public DecoratorPermisos(FileOO2 c) {
		super(c);
	}

	@Override
	public String print() {
		return this.component.getPermisos();
	}


}