package com.example.demo.Controller;

import com.example.demo.Model.DTOs.ToDoDTO;
import com.example.demo.Services.ToDoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Controller
@RequestMapping("/todo")
public class ToDoController {

    private ToDoService todoService;

    @PostMapping("/create")
    public ResponseEntity<ToDoDTO> createToDo(@RequestBody ToDoDTO todo) {
        return new ResponseEntity<ToDoDTO>(todoService.createToDo(todo), HttpStatus.CREATED);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<ToDoDTO>> getAllToDos() {
        return new ResponseEntity<List<ToDoDTO>>(todoService.getAllToDos(), HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<ToDoDTO> getToDoById(@PathVariable("id") int id) {
        return new ResponseEntity<ToDoDTO>(todoService.getToDoById(id), HttpStatus.FOUND);
    }

    @PutMapping("/update")
    public ResponseEntity<ToDoDTO> updateToDo(@RequestBody ToDoDTO todo) {
        return new ResponseEntity<ToDoDTO>(todoService.updateToDo(todo), HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity deleteToDo(@RequestBody ToDoDTO todo) {
        todoService.deleteToDo(todo);
        return new ResponseEntity<>(HttpStatus.GONE);
    }
}
