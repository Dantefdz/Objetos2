package Practica3.Practica3Ejer4;

import java.util.List;

public interface SuggestionStrategy {
	
	public List<Movie> sugeridos(Decoder dato);
}