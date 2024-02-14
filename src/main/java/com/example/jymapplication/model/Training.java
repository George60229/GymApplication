package com.example.jymapplication.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class Training implements Entity {
    private Integer trainingId;
    private Integer traineeId;
    private Integer trainerId;
    private String trainingName;
    private TrainingType trainingType;
    private Date trainingDate;
    private int trainingDuration;
    private String namespace;


    @Override
    public String getNamespace() {
        return namespace;
    }
}
