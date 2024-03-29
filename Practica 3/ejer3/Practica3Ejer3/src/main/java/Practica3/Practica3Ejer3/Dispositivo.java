package Practica3.Practica3Ejer3;

public class Dispositivo {
	private Ringer ringer;
	private Display display;
	private CalculatorStrategy calculator;
	private Connection connection;
	
	public Dispositivo() {
		this.ringer = new Ringer();
		this.display = new Display();
		this.calculator = new CRC16_Calculator();
		this.connection = new G4Adapter();
	}
	
	public String conectarCon(Connection c) {
		this.connection = c;
		this.ringer.ring();
		this.display.showBanner(c.pict());
		return "connecting method changed";
	}
	
	public void useWifi() {
		this.connection = new WifiConn();
		this.display.showBanner(this.connection.pict());
		this.ringer.ring();
	}
	
	public void use4G() {
		this.connection = new G4Adapter();
		this.display.showBanner(this.connection.pict());
		this.ringer.ring();
	}
	
	public String send(String data) {
		return this.connection.sendData(data, calculator.crcFor(data));
	}
	
	public void useCRC32() {
		this.calculator = new CRC32_Calculator();
	}
	
	public void useCRC16() {
		this.calculator = new CRC16_Calculator();
	}
	
	public String configurarCRC(CalculatorStrategy crc) {
		this.calculator = crc;
		return "crc config changed";
	}
	

}