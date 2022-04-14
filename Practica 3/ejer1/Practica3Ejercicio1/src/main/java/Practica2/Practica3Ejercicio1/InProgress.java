package Practica2.Practica3Ejercicio1;

public class InProgress implements State {

	public void togglePause(ToDoItem t) {
		t.setState(new Paused());
	}

	public void finish(ToDoItem t) {
		t.setState(new Finished(t));
	}
	
}