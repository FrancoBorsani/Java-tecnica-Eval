package coop.tecso.examen.commons.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import coop.tecso.examen.commons.GenericSeriviceImp;
import coop.tecso.examen.dao.PersonaDao;
import coop.tecso.examen.model.PersonaModel;
import coop.tecso.examen.service.PersonaService;

@Service
public class PersonaServiceImpl extends GenericSeriviceImp<PersonaModel, Long> implements PersonaService {

	@Autowired
	private PersonaDao personaDao;
	
	@Override
	public CrudRepository<PersonaModel, Long> getDao(){
		return personaDao;
		
	}
	
}
