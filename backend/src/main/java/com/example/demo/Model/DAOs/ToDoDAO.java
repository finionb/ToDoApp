package com.example.demo.Model.DAOs;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Entity
@Getter
@Setter
public class ToDoDAO {
    private String bezeichnung;
    private Date erstellDatum;
    private Date deadline;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
}
