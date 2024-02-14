package com.example.jymapplication.model;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@AllArgsConstructor
public class Trainer extends User {
    private String specialization;

    private Integer userId;

    private String namespace;

    @Override
    public String getNamespace() {
        return namespace;
    }
}
