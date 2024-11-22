package com.jonah.vttp5_ssf_day05l.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jonah.vttp5_ssf_day05l.service.PersonService;
import com.jonah.vttp5_ssf_day05l.utility.Util;

@Controller
@RequestMapping("/persons")
public class PersonController {
    @Autowired
    PersonService personService;

    /* @GetMapping("")
    public String personListPage(){
        List<Person> persons = personService.findAll(Util.keyPerson);
        model.addAttribite persons;
        return persons
    } */
}
