package com.kefas.soap_web_service.service;

import com.kefas.soap_web_service.dto.EmployeeDto;
import com.kefas.soap_web_service.model.Employee;

public interface EmployeeService {

    void addEmployee (Employee employee);

    Employee getEmployeeById (long employeeId);

    void updateEmployee (Employee employee);

    void deleteEmployee (long employeeId);
}
