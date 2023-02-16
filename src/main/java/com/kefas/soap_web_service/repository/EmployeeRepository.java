package com.kefas.soap_web_service.repository;

import com.kefas.soap_web_service.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Employee findByEmployeeId(long employeeId);
}
