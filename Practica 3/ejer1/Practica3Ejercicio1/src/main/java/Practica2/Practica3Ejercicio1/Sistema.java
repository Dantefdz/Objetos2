package Practica2.Practica3Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
	private List<ToDoItem> toDoItems;
		
	public Sistema() {
		this.toDoItems = new ArrayList<ToDoItem>();
	}
		
	public Sistema(List<ToDoItem> list) {
		this.toDoItems = list;
	}
		
	public void addToDoItem(ToDoItem t) {
		this.toDoItems.add(t);
	}
		
	public List<ToDoItem> getToDoItems(){
		return this.toDoItems;
	}
		
}

