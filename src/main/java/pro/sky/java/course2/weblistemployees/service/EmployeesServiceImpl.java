package pro.sky.java.course2.weblistemployees.service;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.weblistemployees.exception.EmployeeAlreadyAddedException;
import pro.sky.java.course2.weblistemployees.exception.EmployeeNotFoundException;
import pro.sky.java.course2.weblistemployees.exception.EmployeeStoragesFullException;
import pro.sky.java.course2.weblistemployees.model.Employee;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeesServiceImpl implements EmployeesService {
    private static final int MAX = 10;
    List<Employee> employeesList = new ArrayList<>();


    @Override
    public Employee getEmployee(String firstNameEmployee, String lastNameEmployee) {
        Employee employee = new Employee(firstNameEmployee, lastNameEmployee);
        if (!employeesList.contains(employee)) {
            throw new EmployeeNotFoundException("сотрудник с такими данными не найден");
        }
        return employee;
    }

    @Override
    public Employee addEmployee(String firstNameEmployee, String lastNameEmployee) {
        Employee employee = new Employee(firstNameEmployee, lastNameEmployee);
        if (employeesList.contains(employee)) {
            throw new EmployeeAlreadyAddedException("данный сотрудник уже есть в списке");
        }
        if (employeesList.size() < MAX) {
            employeesList.add(employee);
            return employee;
        }
        throw new EmployeeStoragesFullException("превышен размер списка");
    }

    @Override
    public Employee removeEmployee(String firstNameEmployee, String lastNameEmployee) {
        Employee employee = new Employee(firstNameEmployee, lastNameEmployee);
            if (!employeesList.contains(employee)) {
                throw new EmployeeNotFoundException("сотрудник с такими данными не найден");
            }
                employeesList.remove(employee);
        return employee;
    }


    @Override
    public List<Employee> print() {
         return new ArrayList<>(employeesList);
    }
}





