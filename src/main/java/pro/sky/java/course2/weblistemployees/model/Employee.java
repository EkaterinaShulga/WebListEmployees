package pro.sky.java.course2.weblistemployees.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;

import java.util.Objects;

public class Employee {
   @JsonPropertyDescription("firstName")
    private String firstNameEmployee;
   @JsonProperty("lastName")
    private String lastNameEmployee;


    public Employee(String firstNameEmployee, String lastNameEmployee) {
        this.firstNameEmployee = firstNameEmployee;
        this.lastNameEmployee = lastNameEmployee;
    }
    public String getFirstNameEmployee() {
        return firstNameEmployee;
    }

    public String getLastNameEmployee() {
        return lastNameEmployee;
    }

    public String toString(){
        return getFirstNameEmployee() + " " + getLastNameEmployee();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Employee employee = (Employee) o;
        return Objects.equals(firstNameEmployee, employee.firstNameEmployee) && Objects.equals(lastNameEmployee, employee.lastNameEmployee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstNameEmployee, lastNameEmployee);
    }
}

