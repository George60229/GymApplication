package com.example.jymapplication.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class Trainee extends User {
    private Date dateOfBirth;
    private String Address;
    private Integer userId;
    private String namespace;

    @Override
    public String getNamespace() {
        return namespace;
    }
}
