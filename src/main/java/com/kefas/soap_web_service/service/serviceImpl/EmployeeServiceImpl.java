package com.kefas.soap_web_service.service.serviceImpl;

import com.kefas.soap_web_service.dto.EmployeeDto;
import com.kefas.soap_web_service.model.Employee;
import com.kefas.soap_web_service.repository.EmployeeRepository;
import com.kefas.soap_web_service.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void AddEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(long employeeId) {
        Employee employee = employeeRepository.findByEmployeeId(employeeId);

        return employee;
    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(long employeeId) {
        employeeRepository.deleteById(employeeId);
    }
}
