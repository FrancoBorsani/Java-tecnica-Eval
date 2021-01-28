package coop.tecso.examen.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import coop.tecso.examen.model.PersonaModel;

public interface PersonaDao extends CrudRepository<PersonaModel, Long> {


}
