package Practica2Ejer3FileSystem.Practica2Ejer3FileSystem;

import java.time.LocalDate;

public class Archivo extends FileSystem{

	
    public Archivo(String nombre, LocalDate fecha, int tamano) {
    	super(nombre, fecha, tamano);
    }

	@Override
	public Archivo archivoMasGrande() {
		return this;
	}

	@Override
	public Archivo archivoMasNuevo() {
		return this;
	}

    
   
    
}