package ar.edu.unlp.oo1.ejercicio1.Ejercicio3MediaPlayer;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {
	private List<Media> mediaFiles;
	
	public  MediaPlayer() {
		mediaFiles = new ArrayList<Media>();
		
	}
	
	public void addMedia(Media m ) {
		mediaFiles.add(m);
	}

	public List<Media> getMedia(){
		return mediaFiles;
	}
	public void playMedia(Media m) {
		m.play();
	}
}
