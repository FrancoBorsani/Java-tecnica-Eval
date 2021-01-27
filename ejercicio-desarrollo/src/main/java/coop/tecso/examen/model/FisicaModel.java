package coop.tecso.examen.model;


import java.util.ArrayList;
import java.util.List;

public class FisicaModel extends PersonaModel {
	private String nombre[] = new String[80];
	private String apellido[] = new String[80];
	private int cc;
	
	
	public FisicaModel() {
	}
	
	public FisicaModel(long rut, String[] nombre, String[] apellido, int cc) {
		super(rut);
		this.nombre = nombre;
		this.apellido = apellido;
		this.cc = cc;
		
	}




	public String[] getNombre() {
		return nombre;
	}

	public void setNombre(String[] nombre) {
		this.nombre = nombre;
	}

	public String[] getApellido() {
		return apellido;
	}

	public void setApellido(String[] apellido) {
		this.apellido = apellido;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	
	

}