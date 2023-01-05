package com.example.demo2.controller;

import com.example.demo2.model.Person;
import com.example.demo2.request.CreatePersonRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class PersonController
{
//    @PostMapping("/person")
//    public void createPerson(@RequestBody Person person)
//    {
//
//    }
    private static Logger logger = LoggerFactory.getLogger(PersonController.class);

    @PostMapping("/person")
    public HttpEntity<Person> createPerson(@RequestBody @Valid CreatePersonRequest personRequest)
    {
        //logging the request
        logger.info("person - {}", personRequest);
        logger.info("Going to save the request in DB...");

        MultiValueMap<String, String> headers = new HttpHeaders();
        headers.add("sample_response_header", "Person type object");

        return new ResponseEntity<>(new Person(), headers,HttpStatus.CREATED);
        //Logic for saving the request in DB
    }
//    public static void main(String args[])
//    {
//
//    }
//        People p = new People();

       //p.setId(1);
//        p.setAge(10);
//        p.setFirstName("ABC");
//        p.setLastName("XYZ");
//
//        Person person = Person.builder()
//                .age(10)
//                .firstName("ABC")
//                .lastName("XYZ")
//                .id(1)
//                .build();
//        People.PeopleBuilder personBuilder = People.builder();
//        personBuilder.firstName("ABC").lastName("XYZ");
//
//        People people1 = People.builder().age(10).build();
//
//        People people = setFn(personBuilder);
//        int personAge = calculateAge();
//    }
//    public static People setFn(People.PeopleBuilder personBuilder)
//    {
//        int age = 10;
//        return personBuilder.age(age).build();
//    }
//    public static int calculateAge()
//    {
//        return 10;
//    }
}
