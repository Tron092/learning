package org.learn.designpatterns.creational.builder;

public class Employee {

    private long id;
    private  String name;
    private String department;
    private String position;
    private double salary;

    public Employee(long id, String name, String department, String position, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.position = position;
        this.salary = salary;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public static class EmployeeBuilder{
        private long id;
        private  String name;
        private String department;
        private String position;
        private double salary;

        public EmployeeBuilder setId(long id) {
            this.id = id;
            return this;
        }

        public EmployeeBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public EmployeeBuilder setDepartment(String department) {
            this.department = department;
            return this;
        }

        public EmployeeBuilder setPosition(String position) {
            this.position = position;
            return this;
        }

        public EmployeeBuilder setSalary(double salary) {
            this.salary = salary;
            return this;
        }

        public Employee build() {
            return new Employee(id, name, department, position, salary);
        }
    }

}
