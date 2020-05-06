package com.example.demo.dao;

import com.example.demo.dto.PersonDTO;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {

    int insertPerson(UUID id, PersonDTO personDTO);

    default int insertPerson(PersonDTO personDTO){
        UUID id = UUID.randomUUID();
        return insertPerson(id, personDTO);
    }

    List<PersonDTO> selectAllPeople();

    Optional<PersonDTO> selectPersonById(UUID id);

    int deletePersonById(UUID id);

    int updatePersonById(UUID id, PersonDTO personDTO);
}
