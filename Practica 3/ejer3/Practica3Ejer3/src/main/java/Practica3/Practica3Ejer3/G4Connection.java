package Practica3.Practica3Ejer3;

public class G4Connection {
	private String symb;

	public G4Connection(String s) {
		this.symb = s;
	}
	
	public G4Connection() {
		this.symb = "4G SYMB";
	}
	
	public String getSymb() {
		return this.symb;
	};
	
	public String transmit(String data, Integer crc) {
		return "transmitting data";
	}
	
}