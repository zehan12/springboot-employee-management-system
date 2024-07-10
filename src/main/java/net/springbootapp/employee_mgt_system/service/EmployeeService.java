package net.springbootapp.employee_mgt_system.service;

import net.springbootapp.employee_mgt_system.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long employeeId);

}
