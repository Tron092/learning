package org.learn.designpatterns.creational.builder;

public class BuilderTest {
    public static void main(String[] args ){
        Employee employee = new Employee.EmployeeBuilder()
                .setId(1)
                .setName("John Doe")
                .setDepartment("Engineering")
                .setPosition("Software Engineer")
                .setSalary(75000)
                .build();

        System.out.println("Employee Created: ");
        System.out.println("ID: " + employee.getId());
        System.out.println("Name: " + employee.getName());
        System.out.println("Department: " + employee.getDepartment());
        System.out.println("Position: " + employee.getPosition());
        System.out.println("Salary: " + employee.getSalary());
    }
}
