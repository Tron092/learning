package org.learn.designpatterns.creational.prototype;

public class PrototypeTest {
    public static void main(String[] args) {
        Employee originalEmployee = new Employee("E001", "John Doe", "Engineering");
        Employee clonedEmployee = originalEmployee.clone();

        System.out.println("Original Employee: " + originalEmployee.getEmpId() + ", " + originalEmployee.getName() + ", " + originalEmployee.getDepartment());
        System.out.println("Cloned Employee: " + clonedEmployee.getEmpId() + ", " + clonedEmployee.getName() + ", " + clonedEmployee.getDepartment());

        // Modifying the cloned employee
        clonedEmployee.setName("Jane Smith");
        clonedEmployee.setDepartment("Marketing");

        System.out.println("After modifying the cloned employee:");
        System.out.println("Original Employee: " + originalEmployee.getEmpId() + ", " + originalEmployee.getName() + ", " + originalEmployee.getDepartment());
        System.out.println("Cloned Employee: " + clonedEmployee.getEmpId() + ", " + clonedEmployee.getName() + ", " + clonedEmployee.getDepartment());
    }
}
