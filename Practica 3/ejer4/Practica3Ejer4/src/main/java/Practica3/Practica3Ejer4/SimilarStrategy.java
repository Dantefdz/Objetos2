package Practica3.Practica3Ejer4;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SimilarStrategy implements SuggestionStrategy {


	@Override
	public List<Movie> sugeridos(Decoder dato) {
		List<Movie> lista =  dato.getMovies().stream().filter(m -> !(dato.getPlayedMovies().contains(m)))
				.collect(Collectors.toList()).stream().sorted(Comparator.comparing(Movie::getReleaseYear).reversed()).collect(Collectors.toList());
		return lista.stream().filter(m -> m.getSimilarMovies().stream().anyMatch(n -> n.getSimilarMovies().contains(m)))
				.limit(3).collect(Collectors.toList());
	}


}
	