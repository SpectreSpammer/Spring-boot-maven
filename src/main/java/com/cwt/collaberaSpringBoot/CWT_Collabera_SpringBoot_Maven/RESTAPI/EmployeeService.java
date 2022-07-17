package com.cwt.collaberaSpringBoot.CWT_Collabera_SpringBoot_Maven.RESTAPI;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService implements EmployeeInterface {

    //creating an object of ArrayList
    List<Employee> employeeList = new ArrayList<>();
    @Override
    public List<Employee> findAll() {
        //adding products to the List
        employeeList.add(new Employee(100,"luffy","captain","strawhat"));
        employeeList.add(new Employee(101, "boa", "captain", "kuja"));
        employeeList.add(new Employee(102, "chopper", "doctor", "strawhat"));
        employeeList.add(new Employee(103, "mihawk", "strongest swordman", "independent"));
        employeeList.add(new Employee(104, "kobi", "captain", "marine"));
        employeeList.add(new Employee(105, "killer", "vice captain", "kid pirates"));
//returns a list of product
        return employeeList;
    }
    public Employee getByEid(Integer eid){

       return employeeList.stream().filter(employee -> employee.getEid().equals(eid)).findFirst().get();
    }
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void updateEmployee(Integer id, Employee employee) {

        employeeList.forEach(e1 -> {
            if (e1.getEid().equals(id)) {
                employeeList.set(employeeList.indexOf(e1),employee);
            }
        });

        /*
        for(int i = 0; i < employeeList.size(); i++){
            Employee emp = employeeList.get(i);
            if(emp.getEid().equals(id)){
                employeeList.set(i,employee);
                return;
            }
        }
        */

    }

    public void deleteEmployee(Integer id) {
          employeeList.removeIf(employee -> employee.getEid().equals(id));
          
    }
}
