package com.nayeonkyoung.springbootcrud.controller;

import com.nayeonkyoung.springbootcrud.model.Person;
import com.nayeonkyoung.springbootcrud.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
​

@Controller
public class PersonController {

    @Autowired
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @RequestMapping(value = "")
    public String homePage(Model model) {
        model.addAttribute("person", new Person());
        return "makePerson";
    }

    @RequestMapping(value = "/person")
    public String getPagePerson(Model model) {
        model.addAttribute("persons", personService.getAllPersons());
        return "result";
    }

    @RequestMapping(value = "/person", method = RequestMethod.POST)
    public String addPagePerson(@ModelAttribute Person person, Model model) {
        personService.createPerson(person);
        model.addAttribute("persons", personService.getAllPersons());
        return "result";
    }

    @RequestMapping(value = "/person/delete/{id}")
    public String deletePagePerson(@PathVariable Long id) {
        personService.deletePerson(id);
        return "redirect:/person";
    }

}