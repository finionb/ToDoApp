package com.example.demo.Services;

import com.example.demo.Mapper.ToDoMapper;
import com.example.demo.Model.DAOs.ToDoDAO;
import com.example.demo.Model.DTOs.ToDoDTO;
import com.example.demo.Repositories.ToDoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoService {
    private ToDoMapper mapper;
    private ToDoRepository repository;
    public ToDoDTO createToDo(ToDoDTO todo) {
        ToDoDAO entitaet = mapper.DTOtoEntity(todo);
        return mapper.entityToDTO(repository.save(entitaet));
    }

    public List<ToDoDTO> getAllToDos() {
        List<ToDoDAO> toDoDAOList = repository.findAll();
        List<ToDoDTO> toDoDTOList = new ArrayList<>();
        for (ToDoDAO toDoDAO: toDoDAOList) {
            toDoDTOList.add(mapper.entityToDTO(toDoDAO));
        }
        return toDoDTOList;
    }

    public ToDoDTO getToDoById(int id) {
        return null;
    }

    public ToDoDTO updateToDo(ToDoDTO todo) {
        ToDoDAO entitaet = mapper.DTOtoEntity(todo);
        return mapper.entityToDTO(repository.save(entitaet));
    }

    public void deleteToDo(ToDoDTO todo) {
        repository.delete(mapper.DTOtoEntity(todo));
    }
}
