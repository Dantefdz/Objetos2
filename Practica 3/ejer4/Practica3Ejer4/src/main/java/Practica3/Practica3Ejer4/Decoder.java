package Practica3.Practica3Ejer4;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Decoder {

	private SuggestionStrategy strategy;
	private List<Movie> movies;
	private List<Movie> moviesPlayed;
	
	public Decoder(List<Movie> movies, List<Movie> played, SuggestionStrategy s) {
		this.movies = movies;
		this.moviesPlayed = played;
		this.strategy = s;
	}
	
	public Decoder(List<Movie> movies) {
		this.movies = movies;
		this.moviesPlayed = new ArrayList<Movie>();
		this.strategy = new SimilarStrategy();
	}
	
	public Decoder() {
		this.movies = new ArrayList<Movie>();
		this.moviesPlayed = new ArrayList<Movie>();
		this.strategy = new SimilarStrategy();
	}
	
	public void addMovie(Movie m) {
		this.movies.add(m);
	}
	
	public void addPlayed(Movie m) {
		this.moviesPlayed.add(m);
	}

	public void setSuggestionStrategy(SuggestionStrategy s) {
		this.strategy = s;
	}
	
	public List<Movie> getMovies() {
		return this.movies;
	}
	
	public List<Movie> getPlayedMovies() {
		return this.moviesPlayed;
	}
	
	public List<Movie> suggestMovies() {
		return this.strategy.sugeridos(this);
	}
}