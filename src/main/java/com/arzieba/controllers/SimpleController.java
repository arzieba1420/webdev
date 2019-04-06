package com.arzieba.controllers;

import com.arzieba.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
public class SimpleController {

    @GetMapping("basic")
    public String basic(Model model){
        String firstName = "Jan";
        String lastName = "Kowalski";

        model.addAttribute("fName",firstName);
        model.addAttribute("lName",lastName);

        Person person = new Person();
        person.setFirstName("Jacek");
        person.setLastName("Nowak");
        person.setPhoneNumber("506-172-098");
        person.setSalary(1000.00);
        person.setVisible(true);

        model.addAttribute("person",person);
        return "basicTemplate";
    }

    @GetMapping("iteration")
    public String iteration(Model model){
        List<Person> list = generateList();

        model.addAttribute("list",list);
        return "iterationTemplate";
    }

    @GetMapping("links")
    public String links(Model model){
        return "linksTemplate";
    }

    @GetMapping("inter")
    public String inter(Model model){
        return "interTemplate";
    }




    private List<Person> generateList(){
        List<Person> list = new ArrayList<>();
        Person person1 = new Person();
        person1.setFirstName("Jacek");
        person1.setLastName("Nowacki");
        person1.setPhoneNumber("506-172-098");
        person1.setSalary(1000.00);
        person1.setVisible(true);
        list.add(person1);

        Person person2 = new Person();
        person2.setFirstName("TestName");
        person2.setLastName("TestLastname");
        person2.setPhoneNumber("111-222-333");
        person2.setSalary(4000.00);
        person2.setVisible(false);
        list.add(person2);

        Person person = new Person();
        person.setFirstName("Foo");
        person.setLastName("Foo");
        person.setPhoneNumber("999-999-098");
        person.setSalary(10000.00);
        person.setVisible(true);
        list.add(person);

        return list;
    }




}
