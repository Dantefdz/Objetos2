package Practica2.Practica3Ejercicio1;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class ToDoItem {
	private State state;
	private String name;
	private LocalDateTime startDate;
	private LocalDateTime finishDate;
	private List<String> comments;
/**
* Instancia un ToDoItem nuevo en estado pending con <name> como nombre.
*/
        public ToDoItem(String name) {
        	this.name = name;
    		this.state = new Pending();
    		this.startDate = null;
    		this.finishDate = null;
    		this.comments = new ArrayList<String>();
        }
        public void setState(State state) {
    		this.state = state;
    	}

    	public void setName(String name) {
    		this.name = name;
    	}
    	
    	public List<String> getComments(){
    		return this.comments;
    	}
    	
    	public String getName() {
    		return this.name;
    	}
    	
    	public State getState() {
    		return this.state;
    	}
    	
    	public LocalDateTime getDateStart() {
    		return this.startDate;
    	}
    	
    	public void setStartDate(LocalDateTime d) {
    		this.startDate = d;
    	}
    	public LocalDateTime getFinishDate() {
    		return finishDate;
    	}

    	public void setFinishDate(LocalDateTime finishDate) {
    		this.finishDate = finishDate;
    	}
    	
    	public LocalDateTime getStartDate() {
    		return this.startDate;
    	}

   	/**
* Pasa el ToDoItem a in-progress (siempre y cuando su estado actual sea
* pending, si se encuentra en otro estado, no hace nada)
*/
    	public void start() {
    		this.state.start(this);
    	}

	/**
* Pasa la tarea a paused si su estado es in-progress, o a in-progress si su
* estado es paused. Caso contrario (pending o finished) genera un error
* informando la causa específica del mismo
*/
    	public void togglePause() {
    		this.state.togglePause(this);
    	}

	/**
* Pasa el ToDoItem a finished (siempre y cuando su estado actual sea 
* in-progress o pausada, si se encuentra en otro estado, no hace nada)
*/
    	public void finish() {
    		this.state.finish(this);
    	}

	/**
* Retorna el tiempo que transcurrió desde que se inició la tarea (start)
* hasta que se finalizó. En caso de que no esté finalizada, el tiempo que
* haya transcurrido hasta el momento actual. Si la tarea no se inició,
* genera un error informando la causa específica del mismo.
*/
    	public Duration workedTime() {
    		if(this.getDateStart() == null) {
    			throw new RuntimeException("Actual State Pending.");
    		}
    		if(this.getFinishDate() != null) {
    			return Duration.between(this.getDateStart(), this.getFinishDate());
    		}
    		return Duration.between(this.getDateStart(), LocalDateTime.now());
    	}

/**
* Agrega un comentario a la tarea siempre y cuando no haya finalizado. Caso
* contrario no hace nada."
*/
    	public void addComment(String comment) {
    		if(this.finishDate == null) {
    			this.comments.add(comment);
    		}
    	}
}
