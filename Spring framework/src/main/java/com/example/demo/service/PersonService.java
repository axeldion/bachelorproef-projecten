package com.example.demo.service;

import com.example.demo.dao.PersonDao;
import com.example.demo.dto.PersonDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PersonService {

    private final PersonDao personDao;

    @Autowired
    public PersonService(@Qualifier("fakeDao") PersonDao personDao) {
        this.personDao = personDao;
    }

    public  int addPerson(PersonDTO personDTO){
        return personDao.insertPerson(personDTO);
    }

    public List<PersonDTO> getAllPeople(){
        return personDao.selectAllPeople();
    }

    public Optional<PersonDTO> getPersonById(UUID id){
        return personDao.selectPersonById(id);
    }

    public int deletePerson(UUID id){
        return personDao.deletePersonById(id);
    }

    public int updatePerson(UUID id, PersonDTO newPersonDTO){
        return  personDao.updatePersonById(id, newPersonDTO);
    }
}
