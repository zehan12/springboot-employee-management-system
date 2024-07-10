package net.springbootapp.employee_mgt_system.service.impl;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import net.springbootapp.employee_mgt_system.dto.EmployeeDto;
import net.springbootapp.employee_mgt_system.entity.Employee;
import net.springbootapp.employee_mgt_system.exception.ResourceNotFoundException;
import net.springbootapp.employee_mgt_system.mapper.EmployeeMapper;
import net.springbootapp.employee_mgt_system.repository.EmployeeRepository;
import net.springbootapp.employee_mgt_system.service.EmployeeService;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.mapToEmployeeDto(employeeDto);
        Employee createdEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(createdEmployee);
    }

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {
        Employee employee = employeeRepository
                .findById(employeeId)
                .orElseThrow(
                        () -> new ResourceNotFoundException(
                                "Employee is not exist with the given id: " + employeeId));
        return EmployeeMapper.mapToEmployeeDto(employee);
    }
}
