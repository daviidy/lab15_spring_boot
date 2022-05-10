package com.example.lab15.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
public class Country {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    @Column(name = "last_updated")
    private LocalDate lastModified;
}
