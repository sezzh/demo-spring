package com.rjbits.demospring.controller;

import com.rjbits.demospring.io.models.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sezzh on 26/11/16.
 */

@RestController
@RequestMapping("/students")
public class StudentController {

    @RequestMapping(value = "/4", method = RequestMethod.GET)
    public Student getStudent() {
        System.out.println("entrando al controller");
        return new Student(4, "jesús", "Los odio a todos");
    }

}
