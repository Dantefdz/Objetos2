package Practica2.Practica3Ejercicio1;

import java.time.LocalDateTime;

public class Finished implements State {

	public Finished(ToDoItem t) {
		t.setFinishDate(LocalDateTime.now());
	}
	
	
}