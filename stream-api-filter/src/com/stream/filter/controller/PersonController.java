package com.stream.filter.controller;

import com.stream.filter.model.Person;
import com.stream.filter.service.PersonService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class PersonController {

    public static void main(String[] args) {
        PersonService personService = new PersonService();

        ArrayList<Person> persons = personService.getPersons();
        {
            //to find person live in madurai
        List<Person> perssoninmadurai = persons.stream()
                .filter(x -> "Madurai".equalsIgnoreCase(x.getAddress().getCity()))
                .collect(Collectors.toList());
            System.out.println("The persons lives in madurai");
        perssoninmadurai.forEach(x-> System.out.println(x.getName()));
            }
            // persons studying EEE in the list
        {
            List<Person> personstudynigEEE = persons.stream()
                    .filter(x -> "EEE".equalsIgnoreCase(x.getAcademy().getDept()))
                    .collect(Collectors.toList());
            System.out.println("The persons studying");
            personstudynigEEE.forEach(x-> System.out.println( x.getName()));
        }

        //THE LIST OF DEPARTMENT NAME WHOSE SEX IS M
        {
            List<Person> departmentname = persons.stream()
                    .filter(x -> "m".equalsIgnoreCase(x.getSex()))
                    .collect(Collectors.toList());
            System.out.println("THE LIST OF DEPARTMENT NAME WHOSE SEX IS M");
            departmentname.forEach(x-> System.out.println(x.getName() +"-"+ x.getAcademy().getDept()));
        }
        //the list of person name whose is F
        {
            List<Person>Personname = persons.stream()
                    .filter(x -> "f".equalsIgnoreCase(x.getSex()))
                    .collect(Collectors.toList());
            System.out.println("THE LIST OF DEPARTMENT NAME WHOSE SEX IS f");
            Personname.forEach(x-> System.out.println(x.getName()));
        }
System.out.println("diensh");

}}
