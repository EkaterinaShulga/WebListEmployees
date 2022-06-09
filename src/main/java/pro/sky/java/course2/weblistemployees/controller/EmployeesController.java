package pro.sky.java.course2.weblistemployees.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.weblistemployees.model.Employee;
import pro.sky.java.course2.weblistemployees.service.EmployeesService;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeesController {
    private final EmployeesService employeesService;

    public EmployeesController(EmployeesService employeesService) {
        this.employeesService = employeesService;
    }

    @GetMapping("/find")
    public Employee getEmployee(@RequestParam("name") String firstNameEmployee,
                                @RequestParam("surname") String lastNameEmployee) {
        return employeesService.getEmployee(firstNameEmployee, lastNameEmployee);
    }


    @GetMapping(value = "/add")
    public Employee addEmployee(@RequestParam("name") String firstNameEmployee,
                                @RequestParam("surname") String lastNameEmployee) {
        Employee employee = new Employee(firstNameEmployee, lastNameEmployee);
        return employeesService.addEmployee(firstNameEmployee, lastNameEmployee);

    }

    @GetMapping("/remove")
    public Employee removeEmployee(@RequestParam("name") String firstNameEmployee,
                                 @RequestParam("surname") String lastNameEmployee) {
        Employee employee = new Employee(firstNameEmployee, lastNameEmployee);
        employeesService.removeEmployee(firstNameEmployee, lastNameEmployee);
        return employee;

    }

    @GetMapping("/print")
    public List<Employee> printListEmployee() {
        return employeesService.print();


    }

}
