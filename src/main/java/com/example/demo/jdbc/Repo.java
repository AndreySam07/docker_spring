package com.example.demo.jdbc;

import ch.qos.logback.core.boolex.EvaluationException;
import com.example.demo.Employee;
import lombok.AllArgsConstructor;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

@Repository
@AllArgsConstructor
public class Repo {

    JdbcTemplate jdbcTemplate;

    public Integer getEmployyes() throws SQLException {
        return jdbcTemplate.queryForObject("SELECT employee_id from HR.employees where first_name ='Alexander'",
                Integer.class);
    }

    public Employee getEmployeeById(int id) {
        String sql = "SELECT * from HR.employees where employee_id = " + id;
        return jdbcTemplate.query(sql, rs -> {
            Employee employee = new Employee();

            while (rs.next()) {


                Integer value = rs.getInt("employee_id");
                if (rs.wasNull()
                ) value = null;


                employee.setFirst_name(rs.getString("first_name"));
            }
            return employee;
        });
    }

}
