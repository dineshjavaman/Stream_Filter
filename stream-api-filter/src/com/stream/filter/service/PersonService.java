package com.stream.filter.service;


import com.stream.filter.model.Academy;
import com.stream.filter.model.Address;
import com.stream.filter.model.Person;

import java.util.ArrayList;

public class PersonService {


    public ArrayList<Person> getPersons() {

        // Created Person 1
        Person person1 = new Person();
        Address address1 = new Address();
        Academy academy1 = new Academy();


        address1.setCity("Madurai");
        address1.setState("TN");

        academy1.setDept("EEE");
        academy1.setGrade("A");

        person1.setName("Ganesh");
        person1.setSex("M");
        person1.setAcademy(academy1);
        person1.setAddress(address1);

        Person person2 = new Person();
        Address address2 = new Address();
        Academy academy2 = new Academy();

        // Created Person 2
        person2.setName("Dinesh");
        person2.setSex("M");

        address2.setCity("Madurai");
        address2.setState("TN");

        academy2.setDept("MCA");
        academy2.setGrade("B");

        person2.setAcademy(academy2);
        person2.setAddress(address2);

        Person person3 = new Person();
        Address address3 = new Address();
        Academy academy3 = new Academy();

        // Created Person 3
        person3.setName("Vidya");
        person3.setSex("F");

        address3.setCity("Suri");
        address3.setState("WB");

        academy3.setDept("EEE");
        academy3.setGrade("B");

        person3.setAcademy(academy3);
        person3.setAddress(address3);

        Person person4 = new Person();
        Address address4 = new Address();
        Academy academy4 = new Academy();

        // Created Person 4
        person4.setName("Selva");
        person4.setSex("M");

        address4.setCity("Madurai");
        address4.setState("TN");

        academy4.setDept("EEE");
        academy4.setGrade("C");

        person4.setAcademy(academy4);
        person4.setAddress(address4);
        // Created Person 5
        Person person5 = new Person();
        Address address5 = new Address();
        Academy academy5 = new Academy();

        person5.setName("Murugeshan");
        person5.setSex("M");

        address5.setCity("Theni");
        address5.setState("TN");

        academy5.setDept("ECE");
        academy5.setGrade("B");

        person5.setAcademy(academy5);
        person5.setAddress(address5);

        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add(person1);
        personArrayList.add(person2);
        personArrayList.add(person3);
        personArrayList.add(person4);
        personArrayList.add(person5);

        return personArrayList;

    }
}
