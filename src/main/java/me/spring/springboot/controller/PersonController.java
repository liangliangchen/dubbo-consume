package me.spring.springboot.controller;

import me.spring.springboot.domain.Person;
import me.spring.springboot.service.PersonConsumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class PersonController {

    @Autowired
    private PersonConsumeService personConsumeService;

    @ResponseBody
    @GetMapping(value = "/person2/getPersonById/{id}")
    public Person getPersonById(@PathVariable("id") Long id) {
        return personConsumeService.getPersonById(id);
    }

}
