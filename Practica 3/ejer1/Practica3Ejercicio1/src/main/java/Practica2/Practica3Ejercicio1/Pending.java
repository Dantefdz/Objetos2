package Practica2.Practica3Ejercicio1;

import java.time.LocalDateTime;

public class Pending implements State {

	@Override
	public void start(ToDoItem toDo) {
		toDo.setStartDate(LocalDateTime.now());
		toDo.setState(new InProgress());
	}
	
	

}