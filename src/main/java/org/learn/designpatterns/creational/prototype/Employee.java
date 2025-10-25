package org.learn.designpatterns.creational.prototype;

public class Employee implements Cloneable{

    private String empId;
    private String name;
    private String department;
    public Employee(String empId, String name, String department) {
        this.empId = empId;
        this.name = name;
        this.department = department;
    }
    public String getEmpId() {
        return empId;
    }
    public void setEmpId(String empId) {
        this.empId = empId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public Employee clone() {
        try {
            return (Employee) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
