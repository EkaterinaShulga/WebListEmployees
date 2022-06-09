package pro.sky.java.course2.weblistemployees.service;

import pro.sky.java.course2.weblistemployees.model.Employee;

import java.util.ArrayList;
import java.util.List;

public interface EmployeesService {

    List<Employee> employeesList = new ArrayList<>();

   Employee addEmployee(String firstNameEmployee, String lastNameEmployee);

   Employee getEmployee(String firstNameEmployee, String lastNameEmployee);

   Employee removeEmployee(String firstNameEmployee, String lastNameEmployee);

  List <Employee> print();
}
