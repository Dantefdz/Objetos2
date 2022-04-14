/**
 * 
 */
package Practica3.Practica4ejer2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class File002Test {
	
	FileOO2 archivo;
	
	@BeforeEach
	void setUp() throws Exception {
		this.archivo = new File("pip",".txt",64,LocalDate.of(1999,7, 13),LocalDate.of(2000, 3, 16),"lectura");
		
	}
    @Test
    public void testPrimerCaso() {
    	//test del nombre 
    	DecoratorExtension e = new DecoratorExtension(archivo);
    	DecoratorName n = new DecoratorName(e);
    	
    	assertEquals("pip - .txt",n.prettyPrint());
    	
        
       
    }
    @Test
    public void testSegundoCaso() {
    	//test del fecha 
    	DecoratorFechaCreacion f = new DecoratorFechaCreacion(archivo);
    	DecoratorExtension e = new DecoratorExtension(f);
    	DecoratorName n = new DecoratorName(e);
    	
    	
    	assertEquals("pip - .txt - 1999-07-13",n.prettyPrint());
    	
        
        
    }
}
