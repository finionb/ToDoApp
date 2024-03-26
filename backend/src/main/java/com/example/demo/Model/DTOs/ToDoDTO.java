package com.example.demo.Model.DTOs;

import lombok.Data;

import java.util.Date;
@Data
public class ToDoDTO {
    private String bezeichnung;
    private Date erstellDatum;
    private Date deadline;
    private int id;
}
