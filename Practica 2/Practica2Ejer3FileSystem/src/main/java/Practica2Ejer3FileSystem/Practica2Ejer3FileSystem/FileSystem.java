package Practica2Ejer3FileSystem.Practica2Ejer3FileSystem;

import java.time.LocalDate;

public abstract class FileSystem {

	protected LocalDate fecha;
	protected String nombre;
	protected int tamano;
	
	public FileSystem(String nombre, LocalDate fecha, int tamano) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.tamano = tamano;
	}
	
	public int tamanoTotalOcupado() {
		return this.tamano;
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public abstract Archivo archivoMasGrande();
	public abstract Archivo archivoMasNuevo();
}