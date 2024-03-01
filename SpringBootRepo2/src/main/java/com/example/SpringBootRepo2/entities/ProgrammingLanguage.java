package com.example.SpringBootRepo2.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class ProgrammingLanguage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private float id;
    @Column(nullable = false)
    private String name;
    private LocalDate firstAppereance;
    private String inventor;

    public ProgrammingLanguage(float id, String name, LocalDate firstAppereance, String inventor) {
        this.id = id;
        this.name = name;
        this.firstAppereance = firstAppereance;
        this.inventor = inventor;
    }

    public ProgrammingLanguage() {
    }

    public float getId() {
        return id;
    }

    public void setId(float id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getFirstAppereance() {
        return firstAppereance;
    }

    public void setFirstAppereance(LocalDate firstAppereance) {
        this.firstAppereance = firstAppereance;
    }

    public String getInventor() {
        return inventor;
    }

    public void setInventor(String inventor) {
        this.inventor = inventor;
    }
}
