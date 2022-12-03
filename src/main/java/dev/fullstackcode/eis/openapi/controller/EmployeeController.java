package dev.fullstackcode.eis.openapi.controller;


//import dev.fullstackcode.eis.entity.Department;
//import dev.fullstackcode.eis.entity.Employee;
//import dev.fullstackcode.eis.entity.Gender;
//import dev.fullstackcode.eis.service.EmployeeService;
import dev.fullstackcode.eis.openapi.mapper.CycleAvoidingMappingContext;
import dev.fullstackcode.eis.openapi.mapper.EmployeeMapper;
import dev.fullstackcode.eis.openapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.openapitools.api.EmployeesApi;
import org.openapitools.model.Employee;

import java.util.List;

@Controller
public class EmployeeController  implements EmployeesApi {

    public EmployeeService employeeService;

    public EmployeeMapper employeeMapper;

    public EmployeeController(EmployeeService employeeService,EmployeeMapper employeeMapper) {
        this.employeeService = employeeService;
        this.employeeMapper = employeeMapper;
    }

    public  ResponseEntity<List<Employee>> listEmployees(Integer limit) {
        List<Employee> empEntities = employeeMapper.toList(employeeService.getAllEmployees());
        return new  ResponseEntity(empEntities, HttpStatus.OK);
    }

    public ResponseEntity<Employee> createEmployee(Employee employee) {
        Employee emp = employeeMapper.toDto(employeeService.createEmployee(employeeMapper.toEntity(employee)));
        return new  ResponseEntity(emp, HttpStatus.OK);

    }

    public  ResponseEntity<Employee> getEmployeeById(Long id) {
        Employee emp = employeeMapper.toDto(employeeService.getEmployeeById(id.intValue()));
        return new  ResponseEntity(emp, HttpStatus.OK);

    }

    public  ResponseEntity<java.lang.Void> deleteEmployee(Long id) {
        employeeService.deleteEmployee(id.intValue());
        return new  ResponseEntity( HttpStatus.OK);
    }
}
