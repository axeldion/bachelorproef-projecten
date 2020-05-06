package com.example.demo.dao;

import com.example.demo.dto.PersonDTO;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("test")
public class PersonDataAccessService implements PersonDao {
    @Override
    public int insertPerson(UUID id, PersonDTO personDTO) {
        return 0;
    }

    @Override
    public List<PersonDTO> selectAllPeople() {
        return List.of(new PersonDTO(UUID.randomUUID(), "testData"));
    }

    @Override
    public Optional<PersonDTO> selectPersonById(UUID id) {
        return Optional.empty();
    }

    @Override
    public int deletePersonById(UUID id) {
        return 0;
    }

    @Override
    public int updatePersonById(UUID id, PersonDTO personDTO) {
        return 0;
    }
}
