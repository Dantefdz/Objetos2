package ar.edu.unlp.oo1.ejercicio1.Ejercicio3MediaPlayer;

public class VideoStreamAdapter implements Media {

	private VideoStream video;
	

	public VideoStreamAdapter(VideoStream video) {
		this.video= video;
	}

	@Override
	public void play() {
		video.reproduce();
	}
}
