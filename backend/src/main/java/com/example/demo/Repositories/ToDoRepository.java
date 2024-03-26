package com.example.demo.Repositories;

import com.example.demo.Model.DAOs.ToDoDAO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepository extends JpaRepository<ToDoDAO, Integer> {
}
