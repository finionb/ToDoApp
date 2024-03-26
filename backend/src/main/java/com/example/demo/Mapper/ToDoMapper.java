package com.example.demo.Mapper;

import com.example.demo.Model.DAOs.ToDoDAO;
import com.example.demo.Model.DTOs.ToDoDTO;
import org.springframework.stereotype.Component;

@Component
public class ToDoMapper {
    public ToDoDTO entityToDTO(ToDoDAO entitaet) {
        ToDoDTO toDoDTO = new ToDoDTO();
        toDoDTO.setId(entitaet.getId());
        toDoDTO.setBezeichnung(entitaet.getBezeichnung());
        toDoDTO.setErstellDatum(entitaet.getErstellDatum());
        toDoDTO.setDeadline(entitaet.getDeadline());
        return toDoDTO;
    }

    public ToDoDAO DTOtoEntity(ToDoDTO toDoDTO) {
        ToDoDAO toDoDAO = new ToDoDAO();
        toDoDAO.setId(toDoDTO.getId());
        toDoDAO.setBezeichnung(toDoDTO.getBezeichnung());
        toDoDAO.setErstellDatum(toDoDTO.getErstellDatum());
        toDoDAO.setDeadline(toDoDTO.getDeadline());
        return toDoDAO;
    }
}
