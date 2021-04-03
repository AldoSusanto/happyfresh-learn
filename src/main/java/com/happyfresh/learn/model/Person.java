package com.happyfresh.learn.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Person implements Serializable {

    private String name;
    private Integer age;
    private String nationality;
}
