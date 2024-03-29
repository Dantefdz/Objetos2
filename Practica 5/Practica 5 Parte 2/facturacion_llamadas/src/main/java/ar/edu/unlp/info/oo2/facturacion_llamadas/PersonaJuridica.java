package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class PersonaJuridica extends Persona{
	private String cuit;
	
	public PersonaJuridica(String nombreyape, String telefono,String cuit) {
		super(nombreyape, telefono);
		this.cuit = cuit;
	}
	
	public String getCuit() {
		return cuit;
	}
	
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	@Override
	public double getDescuento() {
		return 0.15;
	}

	@Override
	public String getTipoPersona() {
		return "juridica";
	}
	
}
	
