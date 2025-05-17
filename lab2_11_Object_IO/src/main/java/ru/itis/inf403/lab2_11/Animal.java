package ru.itis.inf403.lab2_11;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter@Setter@ToString
public class Animal implements Serializable {
    public static long version = 0;

    private String name;
    private Integer age;
    private AnimalType type;
    private AnimalClass category;

}

