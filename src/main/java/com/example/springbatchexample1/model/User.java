package com.example.springbatchexample1.model;

import lombok.Data;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class User {

    @Id
    private Integer id;
    private String name;
    private String dept;
    private Integer salary;
    private Date datetime;

    public User() {
    }

    public User(Integer id, String name, String dept, Integer salary, Date datetime) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.datetime = datetime;
    }
}
