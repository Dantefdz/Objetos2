package Practica3.Practica4ejer2;

public class DecoratorExtension extends FileDecorator {

	public DecoratorExtension(FileOO2 c) {
		super(c);
	}

	@Override
	public String print() {
		return this.component.getExtension();
	}


}