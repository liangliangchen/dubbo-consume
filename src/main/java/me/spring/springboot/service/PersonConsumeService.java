package me.spring.springboot.service;



import com.alibaba.dubbo.config.annotation.Reference;
import me.spring.springboot.domain.Person;
import org.springframework.stereotype.Service;

@Service
public class PersonConsumeService {

    @Reference(version = "0.0.1")
    private PersonService personService;


    public Person getPersonById(Long id) {
        Person person = personService.getPersonById(id);
        System.out.println(person);
        return person;
    }

}
