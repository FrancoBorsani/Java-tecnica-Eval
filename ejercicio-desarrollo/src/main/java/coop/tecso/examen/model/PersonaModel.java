package coop.tecso.examen.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="persona")
public class PersonaModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long rut;
	
	
	public PersonaModel() {
		
		
		
	}
	
	
	public PersonaModel(long rut) {
		this.rut = rut;
		
	}


	public long getRut() {
		return rut;
	}


	public void setRut(long rut) {
		this.rut = rut;
	}
	
	
	
	
	
	
	
}
