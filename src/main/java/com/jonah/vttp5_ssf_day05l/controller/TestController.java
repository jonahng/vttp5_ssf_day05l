package com.jonah.vttp5_ssf_day05l.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jonah.vttp5_ssf_day05l.model.Person;
import com.jonah.vttp5_ssf_day05l.service.PersonService;

@Controller
@RequestMapping("/tests")
public class TestController {


    @Autowired
    PersonService personSvc;

    @ResponseBody
    @GetMapping("/add")
    public String addPerson(){
        Person p = new Person(1, "jamy", "jamy@email.sg");
        personSvc.addPerson("persons", p);

        p = new Person(2, "zee", "zee@email.sg");
        personSvc.addPerson("persons", p);

        return "added persons!";
    }
     
    @ResponseBody
    @GetMapping("/persons")
    public List<Person> personFindAll(){
        return personSvc.findAll("persons");
    }

    @ResponseBody
    @GetMapping("/delete")
    public Boolean deletePerson(){
        Person p = new Person(3,"james","james@ntu.com");
        return personSvc.delete("persons", p);
    }
}
