package ar.edu.unlp.oo1.ejercicio1.Practica2Ejer2Topografia;
/**
 * 
 */
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TopografiasTest {
	
	Tierra t;
	Agua a;
	TopografiaMixta m1,m2,m3;
	
	@BeforeEach
	void setUp() throws Exception {
		t = new Tierra(0);
		a = new Agua(1);
		m1 = new TopografiaMixta();
		m2 = new TopografiaMixta();
		m3 = new TopografiaMixta();
		
		//topologia compuesta con topologias simples
		m1.agregarTopografia(t);
        m1.agregarTopografia(a);
        m1.agregarTopografia(t);
        m1.agregarTopografia(a);
        
        m3.agregarTopografia(t);
        m3.agregarTopografia(a);
        m3.agregarTopografia(t);
        m3.agregarTopografia(a);
        
      //topologia mixta con 3 simples y una mixta
        m2.agregarTopografia(t);
        m2.agregarTopografia(a);
        m2.agregarTopografia(t);
        m2.agregarTopografia(m1);
	}
    @Test
    public void testProporciones() throws Exception {
        
        assertEquals(1,a.getProporcion());
        assertEquals(0,t.getProporcion());
        assertEquals(0.5,m1.getProporcion());
        assertEquals((0.5+1)/4,m2.getProporcion());
    }
    
    @Test
    public void testIgualdad() {
    	assertFalse(m1.esIgualA(m2));
    	assertTrue(m1.esIgualA(m3));
    }
    
    
}