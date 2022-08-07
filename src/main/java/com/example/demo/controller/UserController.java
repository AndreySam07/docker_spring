package com.example.demo.controller;

import com.example.demo.Employee;
import com.example.demo.jdbc.Repo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RestController
@AllArgsConstructor
public class UserController {

    Repo repo;

//    @GetMapping("/employeesNew")
//    public Integer getId() throws SQLException {
//        return repo.getEmployyes();
//    }

    @GetMapping("/employeesNew")
    public Employee getId() throws SQLException {
        return repo.getEmployeeById(103);
    }
}
