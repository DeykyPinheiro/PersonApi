package one.dio.personapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import one.dio.personapi.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
