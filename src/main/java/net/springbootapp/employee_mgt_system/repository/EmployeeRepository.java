package net.springbootapp.employee_mgt_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import net.springbootapp.employee_mgt_system.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
