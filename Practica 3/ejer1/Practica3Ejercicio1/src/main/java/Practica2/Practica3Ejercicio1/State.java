package Practica2.Practica3Ejercicio1;

public interface State {
	
	public default void start(ToDoItem toDo) {
		
	}
	
	public default void togglePause(ToDoItem toDo) {
		throw new RuntimeException("Actual state is "+ toDo.getState().getClass().getName() +", can't pause.");
	}
	
	public default void finish(ToDoItem toDo) {
		
	}
	
}