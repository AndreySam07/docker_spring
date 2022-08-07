package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee  {
    Integer employee_id;
    String first_name;
    String last_name;

}
