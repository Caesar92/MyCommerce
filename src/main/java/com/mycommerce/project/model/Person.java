package com.mycommerce.project.model;

import com.mycommerce.project.dao.exception.UnknownPersonException;

import java.util.ArrayList;
import java.util.List;

public abstract class Person {
    private Long id;
    private String name;
    private boolean isValid;

    Person(Long id, String name, boolean isValid) {
        this.id = id;
        this.name = name;
        this.isValid = false;
    }

    public Person(String name, boolean isValid) {
        this.name = name;
        this.isValid = isValid;
    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public boolean getIsValid() { return isValid; }

    public void setIsValid(boolean isValid) { this.isValid = isValid; }
}
