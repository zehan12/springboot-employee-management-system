package net.springbootapp.employee_mgt_system.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;
import net.springbootapp.employee_mgt_system.dto.EmployeeDto;
import net.springbootapp.employee_mgt_system.service.EmployeeService;

@AllArgsConstructor
@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto) {
        EmployeeDto createdEmployee =  employeeService.createEmployee(employeeDto);
        return new ResponseEntity<>(createdEmployee,HttpStatus.CREATED);
    }
    
}
