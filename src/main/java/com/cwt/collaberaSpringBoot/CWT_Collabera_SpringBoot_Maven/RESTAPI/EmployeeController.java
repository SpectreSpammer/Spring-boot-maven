package com.cwt.collaberaSpringBoot.CWT_Collabera_SpringBoot_Maven.RESTAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee")
    public List<Employee> getEmployee(){
        return employeeService.findAll();
    }


    @RequestMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable Integer id){

        return employeeService.getByEid(id);
    }

    @RequestMapping (method = RequestMethod.POST,value = "/employee/add")
    public void addEmployee(@RequestBody Employee employee){
    employeeService.addEmployee(employee);
    }

    @RequestMapping (method = RequestMethod.PUT,value = "/employee/update/{id}")
    public void updateEmployee(@RequestBody Employee employee,@PathVariable Integer id){
        employeeService.updateEmployee(id,employee);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/employee/delete/{id}")
    public void deleteEmployeeById(@PathVariable Integer id){

         employeeService.deleteEmployee(id);
    }
}
