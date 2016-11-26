package com.rjbits.demospring.io.models;

/**
 * Created by sezzh on 26/11/16.
 */
public class Student {

    private Integer id;
    private String name;
    private String greeting;

    public Student() {
    }

    public Student(Integer id, String name, String greeting) {
        this.id = id;
        this.name = name;
        this.greeting = greeting;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
