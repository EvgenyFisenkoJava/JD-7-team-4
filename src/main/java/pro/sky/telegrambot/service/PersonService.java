package pro.sky.telegrambot.service;

import org.springframework.stereotype.Service;
import pro.sky.telegrambot.Models.Person;
import pro.sky.telegrambot.Repository.PersonRepository;

import java.util.Optional;

@Service

public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    //метод присвоения собаки усыновителю (нужен буде контроллер)

    public Person attachDog(Person person) {
        Optional<Person> adopter = personRepository.findById(person.getChatId());
        if (adopter.isPresent()) {
            person.setDog(person.getDog());
        }
        return person;
    }


}
