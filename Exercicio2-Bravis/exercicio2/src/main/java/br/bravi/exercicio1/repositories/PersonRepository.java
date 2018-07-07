package br.bravi.exercicio1.repositories;

import org.springframework.data.repository.CrudRepository;

import br.bravi.exercicio1.models.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {
	
}
