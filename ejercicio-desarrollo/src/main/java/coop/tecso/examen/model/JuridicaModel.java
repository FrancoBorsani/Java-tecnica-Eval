package coop.tecso.examen.model;


import java.util.ArrayList;
import java.util.List;

public class JuridicaModel extends PersonaModel {
	private String razonSocial[] = new String[100];
	private int anioFundacion;
	
	
	public JuridicaModel() {
	}
	
	public JuridicaModel(long rut, String[] razonSocial,  int anioFundacion) {
		super(rut);
		this.razonSocial = razonSocial;
		this.anioFundacion = anioFundacion;
	}


	public String[] getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String[] razonSocial) {
		this.razonSocial = razonSocial;
	}

	public int getAnioFundacion() {
		return anioFundacion;
	}

	public void setAnioFundacion(int anioFundacion) {
		this.anioFundacion = anioFundacion;
	}
	
	
	
	
	


}